/*
 * Copyright (c) 2021 Evolveum
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.evolveum.wicket.chartjs;

import org.apache.wicket.markup.head.CssReferenceHeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;
import org.apache.wicket.markup.head.OnDomReadyHeaderItem;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.model.IModel;
import org.apache.wicket.request.resource.PackageResourceReference;

public class ChartJsPanel extends WebMarkupContainer {

    public ChartJsPanel(String id, IModel<ChartConfiguration> model) {
        super(id, model);
    }

    private IModel<ChartConfiguration> getModel() {
        return (IModel<ChartConfiguration>) getDefaultModel();
    }

    private ChartConfiguration getModelObject() {
        return getModel() != null ? getModel().getObject() : null;
    }

    @Override
    public void renderHead(IHeaderResponse response) {
        super.renderHead(response);

        ChartConfiguration config = getModelObject();
        if (config == null) {
            return;
        }

        response.render(JavaScriptHeaderItem.forReference(new PackageResourceReference(ChartJsPanel.class,
                "../../../webjars/chartjs/2.9.4/Chart.min.js")));
        response.render(CssReferenceHeaderItem.forReference(new PackageResourceReference(ChartJsPanel.class,
                "../../../webjars/chartjs/2.9.4/Chart.min.css")));


        String script = "var ctx = document.getElementById('" + getMarkupId() + "');"
                +       "var myChart = new Chart(ctx, " + JsonMapper.toJson(config) + ");";
        response.render(OnDomReadyHeaderItem.forScript(script));
    }
}
