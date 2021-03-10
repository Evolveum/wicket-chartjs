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

package com.evolveum.wicket.chartjs.example;


import com.evolveum.wicket.chartjs.*;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LoadableDetachableModel;

public class HomePage extends WebPage {

    public HomePage() {

        IModel<ChartConfiguration> chartConfigModel = createChartModel();
        ChartJsPanel panel = new ChartJsPanel("chart", chartConfigModel);
        add(panel);
    }

    private IModel<ChartConfiguration> createChartModel() {
        return new LoadableDetachableModel<ChartConfiguration>() {

            @Override
            protected ChartConfiguration load() {
                DoughnutChartConfiguration config = new DoughnutChartConfiguration();

                ChartOptions options = createChartOptions();
                config.setOptions(options);

                ChartData data = createChartData();
                config.setData(data);
                return config;
            }
        };
    }

    private ChartOptions createChartOptions() {
        ChartOptions options = new ChartOptions();

        options.setAnimation(createAnimationOptions());
        options.setLegend(createLegendOptions());
        options.setTitle(createTitleOptions());
        return options;
    }

    private ChartData createChartData() {
        ChartData chartData = new ChartData();
        chartData.addDataset(createDataSet());
        chartData.addLabel("One");
        chartData.addLabel("Two");
        chartData.addLabel("Three");
        return chartData;
    }

    private ChartDataset createDataSet() {
        ChartDataset dataset = new ChartDataset();
        dataset.addBackgroudColor("Red");
        dataset.addBackgroudColor("Green");
        dataset.addBackgroudColor("Blue");

        dataset.addData(10);
        dataset.addData(20);
        dataset.addData(30);

        return dataset;
    }

    private ChartAnimationOption createAnimationOptions() {
        ChartAnimationOption animationOption = new ChartAnimationOption();
        animationOption.setDuration(0);
        return animationOption;
    }

    private ChartLegendOption createLegendOptions() {
        ChartLegendOption legendOption = new ChartLegendOption();
        legendOption.setPosition("right");

        ChartLegendLabel label = new ChartLegendLabel();
        label.setBoxWidth(15);
        legendOption.setLabels(label);
        return legendOption;
    }

    private ChartTitleOption createTitleOptions() {
        ChartTitleOption titleOption = new ChartTitleOption();
        titleOption.setFontSize(16);
        return titleOption;
    }
}
