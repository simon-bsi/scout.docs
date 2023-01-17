/*
 * Copyright (c) 2010, 2023 BSI Business Systems Integration AG
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.scout.widgets.client.ui.desktop.hybrid;

import java.util.concurrent.TimeUnit;

import org.eclipse.scout.rt.client.ui.desktop.IDesktop;
import org.eclipse.scout.rt.client.ui.desktop.hybrid.AbstractHybridAction;
import org.eclipse.scout.rt.client.ui.desktop.hybrid.HybridActionType;
import org.eclipse.scout.rt.client.ui.desktop.notification.DesktopNotification;
import org.eclipse.scout.rt.dataobject.IDoEntity;
import org.eclipse.scout.rt.platform.html.HTML;
import org.eclipse.scout.rt.platform.html.IHtmlContent;
import org.eclipse.scout.rt.platform.status.IStatus;
import org.eclipse.scout.rt.platform.status.Status;

@HybridActionType(SendDesktopNotificationHybridAction.TYPE)
public class SendDesktopNotificationHybridAction extends AbstractHybridAction<IDoEntity> {
  protected final static String TYPE = "SendDesktopNotification";

  @Override
  public void execute(IDoEntity data) {
    IHtmlContent message = HTML.fragment(HTML.bold("Scout Classic"), HTML.br(), "This DesktopNotification was sent by the server.");
    IDesktop.CURRENT.get().addNotification(new DesktopNotification(new Status(
        message.toHtml(), IStatus.INFO),
        TimeUnit.SECONDS.toMillis(2),
        true,
        true,
        null));
  }
}
