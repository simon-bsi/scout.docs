/**
 * Copyright (c) 2019 BSI Business Systems Integration AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Distribution License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/org/documents/edl-v10.html
 * <p>
 * Contributors:
 * BSI Business Systems Integration AG - initial API and implementation
 */
package org.eclipse.scout.contacts.shared.person;

import java.util.Date;

import javax.annotation.Generated;

import org.eclipse.scout.rt.shared.data.form.AbstractFormData;
import org.eclipse.scout.rt.shared.data.form.fields.AbstractValueFieldData;
import org.eclipse.scout.rt.shared.data.form.properties.AbstractPropertyData;

/**
 * <b>NOTE:</b><br>This class is auto generated by the Scout SDK. No manual modifications recommended.
 */
@Generated(value = "org.eclipse.scout.contacts.client.person.PersonForm", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class PersonFormData extends AbstractFormData {
  private static final long serialVersionUID = 1L;

  public PictureUrl getPictureUrl() {
    return getFieldByClass(PictureUrl.class);
  }

  public FirstName getFirstName() {
    return getFieldByClass(FirstName.class);
  }

  public LastName getLastName() {
    return getFieldByClass(LastName.class);
  }

  public DateOfBirth getDateOfBirth() {
    return getFieldByClass(DateOfBirth.class);
  }

  public GenderGroup getGenderGroup() {
    return getFieldByClass(GenderGroup.class);
  }

  public Street getStreet() {
    return getFieldByClass(Street.class);
  }

  public City getCity() {
    return getFieldByClass(City.class);
  }

  public Country getCountry() {
    return getFieldByClass(Country.class);
  }

  public Phone getPhone() {
    return getFieldByClass(Phone.class);
  }

  public Mobile getMobile() {
    return getFieldByClass(Mobile.class);
  }

  public Email getEmail() {
    return getFieldByClass(Email.class);
  }

  public Position getPosition() {
    return getFieldByClass(Position.class);
  }

  public Organization getOrganization() {
    return getFieldByClass(Organization.class);
  }

  public PhoneWork getPhoneWork() {
    return getFieldByClass(PhoneWork.class);
  }

  public EmailWork getEmailWork() {
    return getFieldByClass(EmailWork.class);
  }

  public Notes getNotes() {
    return getFieldByClass(Notes.class);
  }

  public PersonIdProperty getPersonIdProperty() {
    return getPropertyByClass(PersonIdProperty.class);
  }

  /**
   * access method for property PersonId.
   */
  public String getPersonId() {
    return getPersonIdProperty().getValue();
  }

  /**
   * access method for property PersonId.
   */
  public void setPersonId(String personId) {
    getPersonIdProperty().setValue(personId);
  }

  public static class PersonIdProperty extends AbstractPropertyData<String> {
    private static final long serialVersionUID = 1L;
  }

  public static class PictureUrl extends AbstractValueFieldData<String> {
    private static final long serialVersionUID = 1L;
  }

  public static class FirstName extends AbstractValueFieldData<String> {
    private static final long serialVersionUID = 1L;
  }

  public static class LastName extends AbstractValueFieldData<String> {
    private static final long serialVersionUID = 1L;
  }

  public static class DateOfBirth extends AbstractValueFieldData<Date> {
    private static final long serialVersionUID = 1L;
  }

  public static class GenderGroup extends AbstractValueFieldData<String> {
    private static final long serialVersionUID = 1L;
  }

  public static class Street extends AbstractValueFieldData<String> {
    private static final long serialVersionUID = 1L;
  }

  public static class City extends AbstractValueFieldData<String> {
    private static final long serialVersionUID = 1L;
  }

  public static class Country extends AbstractValueFieldData<String> {
    private static final long serialVersionUID = 1L;
  }

  public static class Phone extends AbstractValueFieldData<String> {
    private static final long serialVersionUID = 1L;
  }

  public static class Mobile extends AbstractValueFieldData<String> {
    private static final long serialVersionUID = 1L;
  }

  public static class Email extends AbstractValueFieldData<String> {
    private static final long serialVersionUID = 1L;
  }

  public static class Position extends AbstractValueFieldData<String> {
    private static final long serialVersionUID = 1L;
  }

  public static class Organization extends AbstractValueFieldData<String> {
    private static final long serialVersionUID = 1L;
  }

  public static class PhoneWork extends AbstractValueFieldData<String> {
    private static final long serialVersionUID = 1L;
  }

  public static class EmailWork extends AbstractValueFieldData<String> {
    private static final long serialVersionUID = 1L;
  }

  public static class Notes extends AbstractValueFieldData<String> {
    private static final long serialVersionUID = 1L;
  }
}
