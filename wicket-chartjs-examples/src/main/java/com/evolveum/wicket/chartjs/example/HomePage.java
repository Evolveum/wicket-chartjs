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

    enum ChartType {
        PIE, DOUGHOUT, BAR, LINE;
    }

    public HomePage() {

        IModel<ChartConfiguration> doughnutChartConfigModel = createChartModel(ChartType.DOUGHOUT);
        ChartJsPanel doughnutChart = new ChartJsPanel("doughnutChart", doughnutChartConfigModel);
        add(doughnutChart);

        IModel<ChartConfiguration> pieChartConfiguration = createChartModel(ChartType.PIE);
        ChartJsPanel pieChart = new ChartJsPanel("pieChart", pieChartConfiguration);
        add(pieChart);

        IModel<ChartConfiguration> barChartConfiguration = createChartModel(ChartType.BAR);
        ChartJsPanel barChart = new ChartJsPanel("barChart", barChartConfiguration);
        add(barChart);

        IModel<ChartConfiguration> lineChartConfiguration = createChartModel(ChartType.LINE);
        ChartJsPanel lineChart = new ChartJsPanel("lineChart", lineChartConfiguration);
        add(lineChart);
    }

    private IModel<ChartConfiguration> createChartModel(ChartType type) {
        return new LoadableDetachableModel<>() {

            @Override
            protected ChartConfiguration load() {
                ChartConfiguration config;
                switch (type) {
                    case PIE:
                        config = new PieChartConfiguration();
                        break;
                    case DOUGHOUT:
                        config = new DoughnutChartConfiguration();
                        break;
                    case BAR:
                        config = new BarChartConfiguration();
                        break;
                    case LINE:
                        config = new LineChartConfiguration();
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown chart type: " + type);
                }

                appendData(config);
                return config;
            }
        };
    }

    private void appendData(ChartConfiguration config) {
        ChartOptions options = createChartOptions();
        options.setIndexAxis(IndexAxis.AXIS_Y.getValue());
        config.setOptions(options);

        ChartData data = createChartData();
        config.setData(data);

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
        dataset.setLabel("Dataset 1");

        dataset.addBackgroudColor("Red");
        dataset.addBackgroudColor("Green");
        dataset.addBackgroudColor("Blue");
        dataset.setBorderWidth(1);
        dataset.setFill(true);

        dataset.addData(10);
        dataset.addData(20);
        dataset.addData(3000);

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
