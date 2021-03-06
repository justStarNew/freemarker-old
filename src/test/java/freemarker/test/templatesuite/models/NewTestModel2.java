/*
 * Copyright 2014 Attila Szegedi, Daniel Dekany, Jonathan Revusky
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package freemarker.test.templatesuite.models;

import freemarker.template.TemplateScalarModel;

/**
 * Testcase to see how FreeMarker's ?new built-in deals with constructors.
 */
public class NewTestModel2
implements
    TemplateScalarModel {
    private final String string;
    
    public NewTestModel2() {
        string = "default constructor";
    }

    public NewTestModel2(String str) {
        string = str;
    }

    public NewTestModel2(long i) {
        string = Long.toString(i);
    }

    public NewTestModel2(Object o1, java.io.Serializable o2) {
        string = o1 + ":" + o2;
    }

    public String getAsString() {
        return string;
    }
}
