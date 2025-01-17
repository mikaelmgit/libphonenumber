/*
 * Copyright (C) 2022 The Libphonenumber Authors
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
 *
 * @author Tobias Rogg
 */

package com.google.phonenumbers.demo.render;

import com.google.phonenumbers.demo.template.InputFormTemplates;
import com.google.phonenumbers.demo.template.InputFormTemplates.InputForm;

public class InputFormRenderer extends LibPhoneNumberRenderer<InputForm> {

  public InputFormRenderer() {
    super("input_form.soy", "com.google.phonenumbers.demo.inputForm");
  }

  @Override
  public String genHtml() {
    return super.render(
        InputFormTemplates.InputForm.builder()
            .setWelcomeTitle("Phone Number Parser Demo for LibPhoneNumber")
            .build());
  }
}
