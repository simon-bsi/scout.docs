/*
 * Copyright (c) 2010, 2023 BSI Business Systems Integration AG
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.scout.widgets.client.ui.tile;

import org.eclipse.scout.rt.client.ui.tile.ITile;

public interface ICustomTile extends ITile {

  String PROP_LABEL = "label";

  String getLabel();

  void setLabel(String label);

  String getGroup();

  void setGroup(String group);
}
