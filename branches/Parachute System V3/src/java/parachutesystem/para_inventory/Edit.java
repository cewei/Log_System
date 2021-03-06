/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parachutesystem.para_inventory;

import com.sun.data.provider.impl.CachedRowSetDataProvider;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.sql.rowset.CachedRowSetXImpl;
import com.sun.webui.jsf.model.SingleSelectOptionsList;
import javax.faces.FacesException;
import javax.faces.convert.LongConverter;
import parachutesystem.ApplicationBean1;
import parachutesystem.RequestBean1;
import parachutesystem.SessionBean1;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version Edit.java
 * @version Created on Jun 3, 2009, 10:51:46 AM
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
        log("<<Entering para_inventory Edit>>");
        para_inventoryDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{para_inventory$Edit.para_inventoryRowSet}"));
        para_inventoryRowSet.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
        para_inventoryRowSet.setCommand("SELECT * FROM `PARACHUTE_SYSTEM`.para_inventory");
        para_inventoryRowSet.setTableName("para_inventory");
        para_typeDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{para_inventory$Edit.para_typeRowSet}"));
        para_typeRowSet.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
        para_typeRowSet.setCommand("SELECT * FROM `PARACHUTE_SYSTEM`.para_type");
        para_typeRowSet.setTableName("para_type");
        statusDDDefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{
                    new com.sun.webui.jsf.model.Option("unpacked", "unpacked"),
                    new com.sun.webui.jsf.model.Option("packed", "packed"),
                    new com.sun.webui.jsf.model.Option("inspection", "inspection"),
                    new com.sun.webui.jsf.model.Option("repair", "repair"),
                    new com.sun.webui.jsf.model.Option("unserviceable", "unserviceable"),
                    new com.sun.webui.jsf.model.Option("others", "others"),
                    new com.sun.webui.jsf.model.Option("loan", "loan"),
                    new com.sun.webui.jsf.model.Option("returned", "returned")
                });

        switch (getSessionBean1().getEditID()) {
            case 0:
                log("Case 0");
                para_inventoryRowSet.setCommand("SELECT * FROM `PARACHUTE_SYSTEM`.para_inventory");
                para_inventoryDataProvider.refresh();
                break;

            case 1:
                log("Case 1");
                para_inventoryRowSet.setCommand(
                        "SELECT * FROM `PARACHUTE_SYSTEM`.para_inventory INNER JOIN para_type ON para_inventory.type_prefix_no=para_type.para_type_no " +
                        "WHERE `reserve_chute` = 0 AND `static_line` = 1 AND `lifejacket` = 0 AND `AD` = 0 AND `container` = 0");
                para_inventoryDataProvider.refresh();
                break;
            case 2:
                log("Case 2");
                para_inventoryRowSet.setCommand(
                        "SELECT * FROM `PARACHUTE_SYSTEM`.para_inventory INNER JOIN para_type ON para_inventory.type_prefix_no=para_type.para_type_no " +
                        "WHERE `reserve_chute` = 0 AND `static_line` = 0 AND `lifejacket` = 0 AND `AD` = 0 AND `container` = 0");
                para_inventoryDataProvider.refresh();
                break;
            case 3:
                log("Case 3");
                para_inventoryRowSet.setCommand(
                        "SELECT * FROM `PARACHUTE_SYSTEM`.para_inventory INNER JOIN para_type ON para_inventory.type_prefix_no=para_type.para_type_no " +
                        "WHERE `reserve_chute` = 1 AND `static_line` = 1 AND `lifejacket` = 0 AND `AD` = 0 AND `container` = 0");
                para_inventoryDataProvider.refresh();
                break;
            case 4:
                log("Case 4");
                para_inventoryRowSet.setCommand(
                        "SELECT * FROM `PARACHUTE_SYSTEM`.para_inventory INNER JOIN para_type ON para_inventory.type_prefix_no=para_type.para_type_no " +
                        "WHERE `reserve_chute` = 1 AND `static_line` = 0 AND `lifejacket` = 0 AND `AD` = 0 AND `container` = 0");
                para_inventoryDataProvider.refresh();
                break;
            case 5:
                log("Case 5");
                para_inventoryRowSet.setCommand(
                        "SELECT * FROM `PARACHUTE_SYSTEM`.para_inventory INNER JOIN para_type ON para_inventory.type_prefix_no=para_type.para_type_no " +
                        "WHERE `reserve_chute` = 0 AND `static_line` = 0 AND `lifejacket` = 1 AND `AD` = 0 AND `container` = 0");
                para_inventoryDataProvider.refresh();
                break;
            case 6:
                log("Case 6");
                para_inventoryRowSet.setCommand(
                        "SELECT * FROM `PARACHUTE_SYSTEM`.para_inventory INNER JOIN para_type ON para_inventory.type_prefix_no=para_type.para_type_no " +
                        "WHERE `reserve_chute` = 0 AND `static_line` = 0 AND `lifejacket` = 0 AND `AD` = 1 AND `container` = 0");
                para_inventoryDataProvider.refresh();
                break;
            case 7:
                log("Case 7");
                para_inventoryRowSet.setCommand(
                        "SELECT * FROM `PARACHUTE_SYSTEM`.para_inventory INNER JOIN para_type ON para_inventory.type_prefix_no=para_type.para_type_no " +
                        "WHERE `reserve_chute` = 0 AND `static_line` = 0 AND `lifejacket` = 0 AND `AD` = 0 AND `container` = 1");
                para_inventoryDataProvider.refresh();
                break;

            default:
                log("Default");
                para_inventoryRowSet.setCommand("SELECT * FROM `PARACHUTE_SYSTEM`.para_inventory");
                para_inventoryDataProvider.refresh();

        }
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
    private CachedRowSetDataProvider para_typeDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getPara_typeDataProvider() {
        return para_typeDataProvider;
    }

    public void setPara_typeDataProvider(CachedRowSetDataProvider crsdp) {
        this.para_typeDataProvider = crsdp;
    }
    private CachedRowSetXImpl para_typeRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getPara_typeRowSet() {
        return para_typeRowSet;
    }

    public void setPara_typeRowSet(CachedRowSetXImpl crsxi) {
        this.para_typeRowSet = crsxi;
    }
    private LongConverter dropDown1Converter = new LongConverter();

    public LongConverter getDropDown1Converter() {
        return dropDown1Converter;
    }

    public void setDropDown1Converter(LongConverter lc) {
        this.dropDown1Converter = lc;
    }
    private SingleSelectOptionsList statusDDDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getStatusDDDefaultOptions() {
        return statusDDDefaultOptions;
    }

    public void setStatusDDDefaultOptions(SingleSelectOptionsList ssol) {
        this.statusDDDefaultOptions = ssol;
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
        para_inventoryDataProvider.close();
        para_typeDataProvider.close();
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected RequestBean1 getRequestBean1() {
        return (RequestBean1) getBean("RequestBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1) getBean("ApplicationBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1) getBean("SessionBean1");
    }

    public String save_action() {
        try {
            para_inventoryDataProvider.commitChanges();
            return "editToView";
        } catch (Exception ex) {
            log(" ERROR - para_inventory.Edit : Error Description", ex);
            error(" ERROR - " + ex.getMessage());
            return null;
        }
    }
}
