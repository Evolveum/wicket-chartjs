/*
 * Copyright (c) 2023 Evolveum
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

/**
 * Currently only for BAR chart. If another types of charts are added, updated also docs.
 */
public enum IndexAxis {

    AXIS_X("x"),
    AXIS_Y("y");

    private final String value;

    IndexAxis(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}