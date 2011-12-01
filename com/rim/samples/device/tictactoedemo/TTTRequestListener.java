/*
 * TTTRequestListener.java
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

package com.rim.samples.device.tictactoedemo;

import net.rim.blackberry.api.blackberrymessenger.Session;
import net.rim.blackberry.api.blackberrymessenger.SessionRequestListener;
import net.rim.device.api.system.Application;

/**
 * Receives notification of a user accepting a Session.
 * 
 * @see net.rim.blackberry.api.blackberrymessenger.SessionRequestListener
 */
class TTTRequestListener implements SessionRequestListener {
    private static TTTRequestListener _instance;

    private TTTRequestListener() {
    }

    static TTTRequestListener getInstance() {
        if (_instance == null) {
            _instance = new TTTRequestListener();
        }

        return _instance;
    }

    /**
     * Implements SessionRequestListener interface method.
     * 
     * @see net.rim.blackberry.api.blackberrymessenger.SessionRequestListener#sessionRequestAccepted(Session)
     */
    public void sessionRequestAccepted(final Session session) {
        Application.getApplication().requestForeground();
        TicTacToeDemo.getGame().newTwoPlayerGame(true, session);
    }
}
