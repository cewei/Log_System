/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parachutesystem.para_packing;

import com.sun.data.provider.RowKey;
import com.sun.data.provider.impl.CachedRowSetDataProvider;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.sql.rowset.CachedRowSetXImpl;
import com.sun.webui.jsf.component.TableRowGroup;
import com.sun.webui.jsf.event.TableSelectPhaseListener;
import com.sun.webui.jsf.model.SingleSelectOptionsList;
import javax.faces.FacesException;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version Add.java
 * @version Created on Jun 22, 2009, 2:35:13 PM
 * @author Dell
 */
public class Add extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        para_packing_viewDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{para_packing$Add.para_packing_viewRowSet}"));
        para_packing_viewRowSet.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
        para_packing_viewRowSet.setCommand("SELECT * FROM para_packing_view");
        para_packing_viewRowSet.setTableName("para_packing_view");
        para_packingDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{para_packing$Add.para_packingRowSet}"));
        para_packingRowSet.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
        para_packingRowSet.setCommand("SELECT * FROM para_packing");
        para_packingRowSet.setTableName("para_packing");
    }
    // <editor-fold defaultstate="collapsed" desc="Drop Down options">
    private SingleSelectOptionsList packByDDDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getPackByDDDefaultOptions() {
        return packByDDDefaultOptions;
    }

    public void setPackByDDDefaultOptions(SingleSelectOptionsList ssol) {
        this.packByDDDefaultOptions = ssol;
    }
    private SingleSelectOptionsList inspectByDDDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getInspectByDDDefaultOptions() {
        return inspectByDDDefaultOptions;
    }

    public void setInspectByDDDefaultOptions(SingleSelectOptionsList ssol) {
        this.inspectByDDDefaultOptions = ssol;
    }
    private SingleSelectOptionsList checkTypeDDDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getCheckTypeDDDefaultOptions() {
        return checkTypeDDDefaultOptions;
    }

    public void setCheckTypeDDDefaultOptions(SingleSelectOptionsList ssol) {
        this.checkTypeDDDefaultOptions = ssol;
    }
    private SingleSelectOptionsList statusDDDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getStatusDDDefaultOptions() {
        return statusDDDefaultOptions;
    }

    public void setStatusDDDefaultOptions(SingleSelectOptionsList ssol) {
        this.statusDDDefaultOptions = ssol;
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="para_packing_view">
    private CachedRowSetDataProvider para_packing_viewDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getPara_packing_viewDataProvider() {
        return para_packing_viewDataProvider;
    }

    public void setPara_packing_viewDataProvider(CachedRowSetDataProvider crsdp) {
        this.para_packing_viewDataProvider = crsdp;
    }
    private CachedRowSetXImpl para_packing_viewRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getPara_packing_viewRowSet() {
        return para_packing_viewRowSet;
    }

    public void setPara_packing_viewRowSet(CachedRowSetXImpl crsxi) {
        this.para_packing_viewRowSet = crsxi;
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="para_packing">
    private CachedRowSetDataProvider para_packingDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getPara_packingDataProvider() {
        return para_packingDataProvider;
    }

    public void setPara_packingDataProvider(CachedRowSetDataProvider crsdp) {
        this.para_packingDataProvider = crsdp;
    }
    private CachedRowSetXImpl para_packingRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getPara_packingRowSet() {
        return para_packingRowSet;
    }

    public void setPara_packingRowSet(CachedRowSetXImpl crsxi) {
        this.para_packingRowSet = crsxi;
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Table Listener">
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
    // </editor-fold>
    private TableRowGroup tableRowGroup1 = new TableRowGroup();

    public TableRowGroup getTableRowGroup1() {
        return tableRowGroup1;
    }

    public void setTableRowGroup1(TableRowGroup trg) {
        this.tableRowGroup1 = trg;
    }
    // </editor-fold>

    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public Add() {
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
            log("Add Initialization Failure", e);
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
        para_packing_viewDataProvider.close();
        para_packingDataProvider.close();
    }

    public String save_action() {
        int selectedRows = getTableRowGroup1().getSelectedRowsCount();
        if (selectedRows > 0) {
            RowKey[] selectedRowKeys = getTableRowGroup1().getSelectedRowKeys();
            for (int i = 0; i < selectedRowKeys.length; i++) {
                int rowId = Integer.parseInt(selectedRowKeys[i].getRowId()) + 1;
                info("Row " + rowId + " is selected");
                log("Row " + rowId + " is selected");

            //if (para_packingDataProvider.canAppendRow()) {

            //}
            }
            return null;
        } else {
            log(" INFO - para_loan.Add : No row selected");
            info(" INFO - Please select a row.");
            return null;
        }

    //return "addToView";
    }
}

