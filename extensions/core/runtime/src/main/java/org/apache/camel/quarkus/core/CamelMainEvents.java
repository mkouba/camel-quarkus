/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.quarkus.core;

public final class CamelMainEvents {
    private CamelMainEvents() {
    }

    /**
     * Event fired by {@link CamelMain} before the CamelContext is being created and started.
     */
    public static class BeforeStart {
    }

    /**
     * Event fired by {@link CamelMain} to configure the created CamelContext.
     */
    public static class Configure {
    }

    /**
     * Event fired by {@link CamelMain} after the CamelContext has been started.
     */
    public static class AfterStart {
    }

    /**
     * Event fired by {@link CamelMain} before the CamelContext is being stopped.
     */
    public static class BeforeStop {
    }

    /**
     * Event fired by {@link CamelMain} after the CamelContext has been stopped.
     */
    public static class AfterStop {
    }
}
