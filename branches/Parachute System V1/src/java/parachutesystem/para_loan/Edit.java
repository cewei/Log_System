/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parachutesystem.para_loan;

import com.sun.data.provider.RowKey;
import com.sun.data.provider.impl.CachedRowSetDataProvider;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.sql.rowset.CachedRowSetXImpl;
import com.sun.webui.jsf.component.Calendar;
import com.sun.webui.jsf.component.TableRowGroup;
import com.sun.webui.jsf.event.TableSelectPhaseListener;
import javax.faces.FacesException;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version Edit.java
 * @version Created on Jun 18, 2009, 4:56:36 PM
 * @author Dell
 */
public class Edit extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        para_loanDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{para_loan$Edit.para_loanRowSet}"));
        para_loanRowSet.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
        para_loanRowSet.setCommand("SELECT * FROM para_loan");
        para_loanRowSet.setTableName("para_loan");
        para_inventoryDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{para_loan$Edit.para_inventoryRowSet}"));
        para_inventoryRowSet.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
        para_inventoryRowSet.setCommand("SELECT * FROM para_inventory");
        para_inventoryRowSet.setTableName("para_inventory");
    }
    private CachedRowSetDataProvider para_loanDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getPara_loanDataProvider() {
        return para_loanDataProvider;
    }

    public void setPara_loanDataProvider(CachedRowSetDataProvider crsdp) {
        this.para_loanDataProvider = crsdp;
    }
    private CachedRowSetXImpl para_loanRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getPara_loanRowSet() {
        return para_loanRowSet;
    }

    public void setPara_loanRowSet(CachedRowSetXImpl crsxi) {
        this.para_loanRowSet = crsxi;
    }
    private TableSelectPhaseListener tablePhaseListener = new TableSelectPhaseListener();

    public void setSelected(Object object) {
        RowKey rowKey = (RowKey) getValue("#{currentRow.tableRow}");
        if (rowKey != null) {
            tablePhaseListener.setSelected(rowKey, object);
        }
    }

    public Object getSelected() {
        RowKey rowKey = (RowKey) getValue("#{currentRow.tableRow}");
        return tablePhaseListener.getSelected(rowKey);

    }

    public Object getSelectedValue() {
        RowKey rowKey = (RowKey) getValue("#{currentRow.tableRow}");
        return (rowKey != null) ? rowKey.getRowId() : null;

    }

    public boolean getSelectedState() {
        RowKey rowKey = (RowKey) getValue("#{currentRow.tableRow}");
        return tablePhaseListener.isSelected(rowKey);
    }
    private TableRowGroup tableRowGroup1 = new TableRowGroup();

    public TableRowGroup getTableRowGroup1() {
        return tableRowGroup1;
    }

    public void setTableRowGroup1(TableRowGroup trg) {
        this.tableRowGroup1 = trg;
    }
    private Calendar calendar1 = new Calendar();

    public Calendar getCalendar1() {
        return calendar1;
    }

    public void setCalendar1(Calendar c) {
        this.calendar1 = c;
    }
    private CachedRowSetDataProvider para_inventoryDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getPara_inventoryDataProvider() {
        return para_inventoryDataProvider;
    }

    public void setPara_inventoryDataProvider(CachedRowSetDataProvider crsdp) {
        this.para_inventoryDataProvider = crsdp;
    }
    private CachedRowSetXImpl para_inventoryRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getPara_inventoryRowSet() {
        return para_inventoryRowSet;
    }

    public void setPara_inventoryRowSet(CachedRowSetXImpl crsxi) {
        this.para_inventoryRowSet = crsxi;
    }
    // </editor-fold>

    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public Edit() {
    }

    /**
     * <p>Callback method that is called whenever a page is navigated to,
     * either directly via a URL, or indirectly via page navigation.
     * Customize this method to acquire resources that will be needed
     * for event handlers and lifecycle methods, whether or not this
     * page is performing post back processing.</p>
     * 
     * <p>Note that, if the current request is a postback, the property
     * values of the components do <strong>not</strong> represent any
     * values submitted with this request.  Instead, they represent the
     * property values that were saved for this view when it was rendered.</p>
     */
    @Override
    public void init() {
        // Perform initializations inherited from our superclass
        super.init();
        // Perform application initialization that must complete
        // *before* managed components are initialized
        // TODO - add your own initialiation code here

        // <editor-fold defaultstate="collapsed" desc="Managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log("Edit Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
        }

    // </editor-fold>
    // Perform application initialization that must complete
    // *after* managed components are initialized
    // TODO - add your own initialization code here
    }

    /**
     * <p>Callback method that is called after the component tree has been
     * restored, but before any event processing takes place.  This method
     * will <strong>only</strong> be called on a postback request that
     * is processing a form submit.  Customize this method to allocate
     * resources that will be required in your event handlers.</p>
     */
    @Override
    public void preprocess() {
    }

    /**
     * <p>Callback method that is called just before rendering takes place.
     * This method will <strong>only</strong> be called for the page that
     * will actually be rendered (and not, for example, on a page that
     * handled a postback and then navigated to a different page).  Customize
     * this method to allocate resources that will be required for rendering
     * this page.</p>
     */
    @Override
    public void prerender() {
    }

    /**
     * <p>Callback method that is called after rendering is completed for
     * this request, if <code>init()</code> was called (regardless of whether
     * or not this was the page that was actually rendered).  Customize this
     * method to release resources acquired in the <code>init()</code>,
     * <code>preprocess()</code>, or <code>prerender()</code> methods (or
     * acquired during execution of an event handler).</p>
     */
    @Override
    public void destroy() {
        para_loanDataProvider.close();
        para_inventoryDataProvider.close();
    }

    public String edit_action() {
        int selectedRows = getTableRowGroup1().getSelectedRowsCount();
        if (selectedRows > 0) {
            RowKey[] selectedRowKeys = getTableRowGroup1().getSelectedRowKeys();
            for (int i = 0; i < selectedRowKeys.length; i++) {
                para_loanDataProvider.setCursorRow(selectedRowKeys[i]);

                para_loanDataProvider.setValue("date_in", calendar1.getValue());

                String[] fieldKeys = {"para_inventory.type_prefix_no", "para_inventory.chute_no", "para_inventory.serial_no"};
                Object[] values = {para_loanDataProvider.getValue("type_prefix_no"), para_loanDataProvider.getValue("chute_no"), para_loanDataProvider.getValue("serial_no")};
                RowKey[] rks = para_inventoryDataProvider.findAll(fieldKeys, values);

                if (rks.length == 1) {
                    para_inventoryDataProvider.setCursorRow(rks[0]);
                    para_inventoryDataProvider.setValue("para_inventory.status", "returned");

                    para_loanDataProvider.commitChanges();
                    para_inventoryDataProvider.commitChanges();
                } else {
                    log(" ERROR - para_packing.Add : Too many parachutes");
                    error(" ERROR - Too many parachutes");
                    return null;
                }
            }
            return "editToView";
        } else {
            log(" INFO - para_loan.Edit : No row selected");
            info(" INFO - Please select a row.");
            return null;
        }
    }
}

