/*
 * Copyright (c) 2010, 2023 BSI Business Systems Integration AG
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.scout.contacts.shared.person;

import jakarta.annotation.Generated;

import org.eclipse.scout.contacts.shared.common.AbstractAddressBoxData;
import org.eclipse.scout.rt.platform.classid.ClassId;
import org.eclipse.scout.rt.shared.data.form.AbstractFormData;
import org.eclipse.scout.rt.shared.data.form.fields.AbstractValueFieldData;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications recommended.
 */
@ClassId("fcac7a9a-0566-4ce4-b03a-d84f7a9a6006-formdata")
@Generated(value = "org.eclipse.scout.contacts.client.person.PersonSearchForm", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class PersonSearchFormData extends AbstractFormData {
  private static final long serialVersionUID = 1L;

  public FirstName getFirstName() {
    return getFieldByClass(FirstName.class);
  }

  public LastName getLastName() {
    return getFieldByClass(LastName.class);
  }

  public Location getLocation() {
    return getFieldByClass(Location.class);
  }

  public Organization getOrganization() {
    return getFieldByClass(Organization.class);
  }

  @ClassId("d2b9010c-d3d0-4180-adc2-207226620eee-formdata")
  public static class FirstName extends AbstractValueFieldData<String> {
    private static final long serialVersionUID = 1L;
  }

  @ClassId("ae755faf-72b7-4b8a-9b63-52de1e64e8a2-formdata")
  public static class LastName extends AbstractValueFieldData<String> {
    private static final long serialVersionUID = 1L;
  }

  @ClassId("99b367ce-c0fc-4055-8e3c-b6bda55af129-formdata")
  public static class Location extends AbstractAddressBoxData {
    private static final long serialVersionUID = 1L;
  }

  @ClassId("c782f468-8ff9-4a91-a23e-b5e06be5bc3e-formdata")
  public static class Organization extends AbstractValueFieldData<String> {
    private static final long serialVersionUID = 1L;
  }
}
