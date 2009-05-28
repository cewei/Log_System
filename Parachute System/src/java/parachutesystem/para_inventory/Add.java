/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parachutesystem.para_inventory;

import com.sun.data.provider.impl.CachedRowSetDataProvider;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.DropDown;
import javax.faces.FacesException;
import javax.faces.convert.LongConverter;
import javax.faces.event.ValueChangeEvent;
import parachutesystem.SessionBean1;
import parachutesystem.ApplicationBean1;
import parachutesystem.RequestBean1;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version Add.java
 * @version Created on May 26, 2009, 3:22:17 PM
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
        para_typeDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.para_typeRowSet}"));
        para_inventoryDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.para_inventoryRowSet}"));
        para_inventory_viewDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.para_inventory_viewRowSet}"));
    }
    private CachedRowSetDataProvider para_typeDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getPara_typeDataProvider() {
        return para_typeDataProvider;
    }

    public void setPara_typeDataProvider(CachedRowSetDataProvider crsdp) {
        this.para_typeDataProvider = crsdp;
    }
    private CachedRowSetDataProvider para_inventoryDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getPara_inventoryDataProvider() {
        return para_inventoryDataProvider;
    }

    public void setPara_inventoryDataProvider(CachedRowSetDataProvider crsdp) {
        this.para_inventoryDataProvider = crsdp;
    }
    private String chute_no;

    /**
     * @return the chute_no
     */
    public String getChute_no() {
        return chute_no;
    }

    /**
     * @param chute_no the chute_no to set
     */
    public void setChute_no(String chute_no) {
        this.chute_no = chute_no;
    }
    private DropDown typeDropDown = new DropDown();

    public DropDown getTypeDropDown() {
        return typeDropDown;
    }

    public void setTypeDropDown(DropDown dd) {
        this.typeDropDown = dd;
    }
    private CachedRowSetDataProvider para_inventory_viewDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getPara_inventory_viewDataProvider() {
        return para_inventory_viewDataProvider;
    }

    public void setPara_inventory_viewDataProvider(CachedRowSetDataProvider crsdp) {
        this.para_inventory_viewDataProvider = crsdp;
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
        Object selectedTypeId = typeDropDown.getSelected();
        try {
//            personDataProvider.setCursorRow(
//                    personDataProvider.findFirst("PERSON.PERSONID",
//                    selectedPersonId));
//            getSessionBean1().getTripRowSet().setObject(1, selectedPersonId);
//            tripDataProvider.refresh();
//            form1.discardSubmittedValues("save");
        } catch (Exception e) {
//            error("Cannot switch to person " + selectedPersonId);
//            log("Cannot switch to person " + selectedPersonId, e);
        }
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
        para_inventory_viewDataProvider.close();
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1) getBean("SessionBean1");
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
    protected RequestBean1 getRequestBean1() {
        return (RequestBean1) getBean("RequestBean1");
    }

    public String add_action() {
        return "addToView";
    }

    public void typeDropDown_processValueChange(ValueChangeEvent event) {
        Object selectedTypeID = typeDropDown.getSelected();

        try {
            para_inventoryDataProvider.setCursorRow(
                    para_inventoryDataProvider.findFirst("name", selectedTypeID));
            //().getPara_inventory_viewRowSet()
        } catch (Exception ex) {
            log("Error Description", ex);
            error(ex.getMessage());
        }
    }
}

