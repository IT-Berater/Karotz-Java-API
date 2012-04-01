/*
 * The MIT License
 *
 * Copyright (c) 2011, Seiji Sogabe
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.peripheralware.karotz.action.led;

import org.peripheralware.karotz.action.KarotzAction;

import java.util.HashMap;
import java.util.Map;

/**
 * Led Light Action.
 *
 * @author Seiji Sogabe
 */
public class LedLightAction implements KarotzAction {

    private String color;

    public LedLightAction(String color) {
        this.color = color;
    }

    public LedLightAction(LedColor color) {
        this(color.getCode());
    }

    public String getURL() {
        return "http://api.karotz.com/api/karotz/led";
    }

    public Map<String, String> getParameters() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("action", "light");
        if (color != null) {
            params.put("color", color);
        }
        return params;
    }
}
