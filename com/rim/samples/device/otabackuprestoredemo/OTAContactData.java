/**
 * OTAContactData.java
 * 
 * Copyright � 1998-2011 Research In Motion Limited
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
 * Note: For the sake of simplicity, this sample application may not leverage
 * resource bundles and resource strings.  However, it is STRONGLY recommended
 * that application developers make use of the localization features available
 * within the BlackBerry development platform to ensure a seamless application
 * experience across a variety of languages and geographies.  For more information
 * on localizing your application, please refer to the BlackBerry Java Development
 * Environment Development Guide associated with this release.
 */

package com.rim.samples.device.otabackuprestoredemo;

import net.rim.device.api.synchronization.SyncObject;
import net.rim.device.api.util.Persistable;

class OTAContactData implements SyncObject, Persistable {
    private int _uid;
    private String _first, _last, _email;

    OTAContactData() {
    }

    OTAContactData(final int uid) {
        _uid = uid;
    }

    void setUID(final int uid) {
        _uid = uid;
    }

    public int getUID() {
        return _uid;
    }

    void setFirst(final String first) {
        _first = first;
    }

    String getFirst() {
        return _first;
    }

    void setLast(final String last) {
        _last = last;
    }

    String getLast() {
        return _last;
    }

    void setEmail(final String email) {
        _email = email;
    }

    String getEmail() {
        return _email;
    }

    public boolean equals(final Object o) {
        if (o instanceof OTAContactData) {
            if (getFirst().equals(((OTAContactData) o).getFirst())
                    && getLast().equals(((OTAContactData) o).getLast())) {
                return true;
            }
        }

        return false;
    }
}
