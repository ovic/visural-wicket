/*
 *  Copyright 2010 Richard Nichols.
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */
package com.visural.wicket.util;

import org.apache.wicket.Component;
import org.apache.wicket.behavior.Behavior;

/**
 *
 * @author Richard Nichols
 */
public class RenderAsInlineBlockComponentBorder extends Behavior {

    @Override
    public void beforeRender(Component cmpnt) {
        cmpnt.getResponse().write("<div style=\"display: inline-block;\">");
    }

    @Override
    public void afterRender(Component cmpnt) {
        cmpnt.getResponse().write("</div>");
    }
}
