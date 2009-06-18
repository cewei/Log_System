/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parachutesystem;

import com.sun.data.provider.impl.CachedRowSetDataProvider;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.sql.rowset.CachedRowSetXImpl;
import com.sun.webui.jsf.component.StaticText;
import javax.faces.FacesException;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version Page1.java
 * @version Created on May 21, 2009, 11:43:48 AM
 * @author Dell
 */
public class Page1 extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        para_inventoryDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{Page1.para_inventoryRowSet}"));
        para_inventoryRowSet.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
        para_inventoryRowSet.setCommand("SELECT COUNT(*)  FROM para_inventory WHERE `status` = \"loan\"");
        para_inventoryRowSet.setTableName("para_inventory");
        para_inventoryRowSet1.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
        para_inventoryRowSet1.setCommand("SELECT COUNT(*)  FROM para_inventory WHERE `status` = \"serviceable\"");
        para_inventoryRowSet1.setTableName("para_inventory");
        para_inventoryRowSet2.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
        para_inventoryRowSet2.setCommand("SELECT COUNT(*)  FROM para_inventory WHERE `status` = \"servicing\" OR `status` = \"returned\"");
        para_inventoryRowSet2.setTableName("para_inventory");
    }
    private StaticText loanT = new StaticText();

    public StaticText getLoanT() {
        return loanT;
    }

    public void setLoanT(StaticText st) {
        this.loanT = st;
    }
    private StaticText serviceableT = new StaticText();

    public StaticText getServiceableT() {
        return serviceableT;
    }

    public void setServiceableT(StaticText st) {
        this.serviceableT = st;
    }
    private StaticText servicingT = new StaticText();

    public StaticText getServicingT() {
        return servicingT;
    }

    public void setServicingT(StaticText st) {
        this.servicingT = st;
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

    private CachedRowSetXImpl para_inventoryRowSet1 = new CachedRowSetXImpl();

    public CachedRowSetXImpl getPara_inventoryRowSet1() {
        return para_inventoryRowSet1;
    }

    public void setPara_inventoryRowSet1(CachedRowSetXImpl crsxi) {
        this.para_inventoryRowSet1 = crsxi;
    }

    private CachedRowSetXImpl para_inventoryRowSet2 = new CachedRowSetXImpl();

    public CachedRowSetXImpl getPara_inventoryRowSet2() {
        return para_inventoryRowSet2;
    }

    public void setPara_inventoryRowSet2(CachedRowSetXImpl crsxi) {
        this.para_inventoryRowSet2 = crsxi;
    }

    // </editor-fold>

    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public Page1() {
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
            log("Page1 Initialization Failure", e);
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
        loanT.setText(para_inventoryDataProvider.getValue("count(*)"));
        para_inventoryDataProvider.setCachedRowSet(para_inventoryRowSet1);
        serviceableT.setText(para_inventoryDataProvider.getValue("count(*)"));
        para_inventoryDataProvider.setCachedRowSet(para_inventoryRowSet2);
        servicingT.setText(para_inventoryDataProvider.getValue("count(*)"));
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

}

