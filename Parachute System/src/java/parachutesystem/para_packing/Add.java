/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package parachutesystem.para_packing;

import com.sun.data.provider.impl.CachedRowSetDataProvider;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.sql.rowset.CachedRowSetXImpl;
import com.sun.webui.jsf.component.StaticText;
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
 * @version Created on Jun 3, 2009, 3:50:26 PM
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
        statusDDDefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{new com.sun.webui.jsf.model.Option("serviceable", "serviceable"), new com.sun.webui.jsf.model.Option("servicing", "servicing"), new com.sun.webui.jsf.model.Option("loan", "loan"),new com.sun.webui.jsf.model.Option("returned", "returned")});
        checkTypeDDDefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{new com.sun.webui.jsf.model.Option("repacking", "repacking"), new com.sun.webui.jsf.model.Option("inspection", "inspection")});
        para_packing_viewDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{para_packing$Add.para_packing_viewRowSet}"));
        para_packing_viewRowSet.setDataSourceName("java:comp/env/jdbc/PARACHUTE_SYSTEM_MySQL");
        para_packing_viewRowSet.setCommand("SELECT * FROM `PARACHUTE_SYSTEM`.para_packing_view WHERE `Serial No`=? AND para_type_no=? AND chute_no=?");
        para_packing_viewRowSet.setTableName("para_packing_view");
    }
    private SingleSelectOptionsList statusDDDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getStatusDDDefaultOptions() {
        return statusDDDefaultOptions;
    }

    public void setStatusDDDefaultOptions(SingleSelectOptionsList ssol) {
        this.statusDDDefaultOptions = ssol;
    }
    private SingleSelectOptionsList checkTypeDDDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getCheckTypeDDDefaultOptions() {
        return checkTypeDDDefaultOptions;
    }

    public void setCheckTypeDDDefaultOptions(SingleSelectOptionsList ssol) {
        this.checkTypeDDDefaultOptions = ssol;
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
    private StaticText serialNoST = new StaticText();

    public StaticText getSerialNoST() {
        return serialNoST;
    }

    public void setSerialNoST(StaticText st) {
        this.serialNoST = st;
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
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
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
        serialNoST.setText(retrieveData("serial_no"));

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

}

