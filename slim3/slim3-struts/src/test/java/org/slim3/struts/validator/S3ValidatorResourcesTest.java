/*
 * Copyright 2004-2009 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.slim3.struts.validator;

import java.util.Locale;

import junit.framework.TestCase;

import org.apache.commons.validator.Form;
import org.apache.commons.validator.FormSet;

/**
 * @author higa
 * @since 3.0
 * 
 */
public class S3ValidatorResourcesTest extends TestCase {

    /**
     * @throws Exception
     */
    public void testForm() throws Exception {
        S3ValidatorResources vr = new S3ValidatorResources();
        FormSet fs = new FormSet();
        Form form = new Form();
        String name = "hoge";
        form.setName(name);
        fs.addForm(form);
        vr.addFormSet(fs);
        assertSame(form, vr.getForm(Locale.getDefault(), name));
    }
}