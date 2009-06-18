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
import java.util.Date;
import javax.faces.FacesException;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version View.java
 * @version Created on Jun 3, 2009, 3:47:42 PM
 * @author Dell
 */
public class View extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        para_packing_viewDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{para_packing$View.para_packing_viewRowSet}"));
        para_packing_viewRowSet.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
        para_packing_viewRowSet.setCommand("SELECT * FROM `PARACHUTE_SYSTEM`.para_packing_view");
        para_packing_viewRowSet.setTableName("para_packing_view");
    }
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
    private TableRowGroup tableRowGroup1 = new TableRowGroup();

    public TableRowGroup getTableRowGroup1() {
        return tableRowGroup1;
    }

    public void setTableRowGroup1(TableRowGroup trg) {
        this.tableRowGroup1 = trg;
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

    // </editor-fold>
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public View() {
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
            log("View Initialization Failure", e);
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
    }

    public synchronized String select_action() {
        int selectedRows = getTableRowGroup1().getSelectedRowsCount();

        RowKey[] selectedRowKeys = getTableRowGroup1().getSelectedRowKeys();

        if (selectedRows == 1) {
            try {
                para_packing_viewDataProvider.setCursorRow(selectedRowKeys[0]);
                String serialNo = (String) para_packing_viewDataProvider.getValue("Serial No");
                String chuteNo = (String) para_packing_viewDataProvider.getValue("chute_no");
                Long paraTypeNo = (Long) para_packing_viewDataProvider.getValue("para_type_no");
                String chute_No = (String) para_packing_viewDataProvider.getValue("Chute No");
                Date datePacked = (Date) para_packing_viewDataProvider.getValue("Repacked Date");
                String packBy = (String) para_packing_viewDataProvider.getValue("Pack By");
                String inspectBy = (String) para_packing_viewDataProvider.getValue("Inspect By");
                String checkType = (String) para_packing_viewDataProvider.getValue("Check Type");
                String status = (String) para_packing_viewDataProvider.getValue("Status");

                getParaPackingBean().setSerialNo(serialNo);
                getParaPackingBean().setChuteNo(chuteNo);
                getParaPackingBean().setParaTypeNo(paraTypeNo);
                getParaPackingBean().setChute_No(chute_No);
                getParaPackingBean().setDatePacked(datePacked);
                getParaPackingBean().setPackBy(packBy);
                getParaPackingBean().setInspectBy(inspectBy);
                getParaPackingBean().setCheckType(checkType);
                getParaPackingBean().setStatus(status);

                return "viewToAdd";
            } catch (Exception ex) {
                log(" ERROR - para_packing.View : Error Description ", ex);
                error(" ERROR - " +ex.getMessage());
                return null;
            }
        }
        else {
            log(" INFO - para_packing.View : No row selected.");
            info(" INFO - Please select a row.");
            return null;
        }
    }

    protected ParaPackingBean getParaPackingBean() {
        return (ParaPackingBean) getBean("para_packing$ParaPackingBean");
    }
}

