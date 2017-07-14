package org.eclipsescout.demo.bahbah.shared.services;

import javax.annotation.Generated;

import org.eclipse.scout.rt.shared.data.basic.table.AbstractTableRowData;
import org.eclipse.scout.rt.shared.data.page.AbstractTablePageData;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications recommended.
 */
@Generated(value = "org.eclipsescout.demo.bahbah.client.ui.desktop.outlines.pages.UserAdministrationTablePage", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class UserAdministrationTablePageData extends AbstractTablePageData {

  private static final long serialVersionUID = 1L;

  @Override
  public UserAdministrationTableRowData addRow() {
    return (UserAdministrationTableRowData) super.addRow();
  }

  @Override
  public UserAdministrationTableRowData addRow(int rowState) {
    return (UserAdministrationTableRowData) super.addRow(rowState);
  }

  @Override
  public UserAdministrationTableRowData createRow() {
    return new UserAdministrationTableRowData();
  }

  @Override
  public Class<? extends AbstractTableRowData> getRowType() {
    return UserAdministrationTableRowData.class;
  }

  @Override
  public UserAdministrationTableRowData[] getRows() {
    return (UserAdministrationTableRowData[]) super.getRows();
  }

  @Override
  public UserAdministrationTableRowData rowAt(int index) {
    return (UserAdministrationTableRowData) super.rowAt(index);
  }

  public void setRows(UserAdministrationTableRowData[] rows) {
    super.setRows(rows);
  }

  public static class UserAdministrationTableRowData extends AbstractTableRowData {

    private static final long serialVersionUID = 1L;
    public static final String userId = "userId";
    public static final String username = "username";
    private Long m_userId;
    private String m_username;

    public Long getUserId() {
      return m_userId;
    }

    public void setUserId(Long newUserId) {
      m_userId = newUserId;
    }

    public String getUsername() {
      return m_username;
    }

    public void setUsername(String newUsername) {
      m_username = newUsername;
    }
  }
}
