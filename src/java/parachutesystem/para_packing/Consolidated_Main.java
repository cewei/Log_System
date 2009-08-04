/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parachutesystem.para_packing;

import com.sun.data.provider.impl.CachedRowSetDataProvider;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.sql.rowset.CachedRowSetXImpl;
import com.sun.webui.jsf.component.Calendar;
import java.util.Date;
import javax.faces.FacesException;
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
 * @version Consolidated_Main.java
 * @version Created on 28/07/2009, 1:34:49 PM
 * @author user
 */
public class Consolidated_Main extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        log("<<Entering para_packing Consolidated_Main>>");
        para_consolidated_viewDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{para_packing$Consolidated_Main.para_consolidated_viewRowSet1}"));
        para_consolidated_viewRowSet1.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
        para_consolidated_viewRowSet1.setCommand("SELECT * FROM para_consolidated_view");
        para_consolidated_viewRowSet1.setTableName("para_consolidated_view");
    }
    private CachedRowSetDataProvider para_consolidated_viewDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getPara_consolidated_viewDataProvider() {
        return para_consolidated_viewDataProvider;
    }

    public void setPara_consolidated_viewDataProvider(CachedRowSetDataProvider crsdp) {
        this.para_consolidated_viewDataProvider = crsdp;
    }
    private CachedRowSetXImpl para_consolidated_viewRowSet1 = new CachedRowSetXImpl();

    public CachedRowSetXImpl getPara_consolidated_viewRowSet1() {
        return para_consolidated_viewRowSet1;
    }

    public void setPara_consolidated_viewRowSet1(CachedRowSetXImpl crsxi) {
        this.para_consolidated_viewRowSet1 = crsxi;
    }
    private Calendar calendar1 = new Calendar();

    public Calendar getCalendar1() {
        return calendar1;
    }

    public void setCalendar1(Calendar c) {
        this.calendar1 = c;
    }

    // </editor-fold>
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public Consolidated_Main() {
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
            log("Consolidated_Main Initialization Failure", e);
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
        para_consolidated_viewDataProvider.close();
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

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1) getBean("SessionBean1");
    }

    public String update_action() {
        return "viewToEdit";
    }

    public String button1_action() {
        Date temp;
        if (calendar1.getText() != null) {
            temp = (Date) calendar1.getText();
        } else {
            temp = new Date();
        }
        getSessionBean1().setDate((temp.getYear() + 1900) + "-" + (temp.getMonth() + 1) + "-" + temp.getDate());
        return "viewToReport";
    }

    private void changeStatement(int i) {
        try {
            switch (i) {
                case 0:
                    log("Case 0");
                    para_consolidated_viewRowSet1.setCommand("SELECT * FROM para_consolidated_view");
                    para_consolidated_viewDataProvider.refresh();
                    break;

                case 1:
                    log("Case 1");
                    para_consolidated_viewRowSet1.setCommand(
                            "SELECT * FROM para_consolidated_view " +
                            "WHERE `reserve_chute` = 0 AND `static_line` = 1 AND `lifejacket` = 0 AND `AD` = 0 AND `container` = 0");
                    para_consolidated_viewDataProvider.refresh();
                    break;
                case 2:
                    log("Case 2");
                    para_consolidated_viewRowSet1.setCommand(
                            "SELECT * FROM para_consolidated_view " +
                            "WHERE `reserve_chute` = 0 AND `static_line` = 0 AND `lifejacket` = 0 AND `AD` = 0 AND `container` = 0");
                    para_consolidated_viewDataProvider.refresh();
                    break;
                case 3:
                    log("Case 3");
                    para_consolidated_viewRowSet1.setCommand(
                            "SELECT * FROM para_consolidated_view " +
                            "WHERE `reserve_chute` = 1 AND `static_line` = 1 AND `lifejacket` = 0 AND `AD` = 0 AND `container` = 0");
                    para_consolidated_viewDataProvider.refresh();
                    break;
                case 4:
                    log("Case 4");
                    para_consolidated_viewRowSet1.setCommand(
                            "SELECT * FROM para_consolidated_view " +
                            "WHERE `reserve_chute` = 1 AND `static_line` = 0 AND `lifejacket` = 0 AND `AD` = 0 AND `container` = 0");
                    para_consolidated_viewDataProvider.refresh();
                    break;
                case 5:
                    log("Case 5");
                    para_consolidated_viewRowSet1.setCommand(
                            "SELECT * FROM para_consolidated_view " +
                            "WHERE `reserve_chute` = 0 AND `static_line` = 0 AND `lifejacket` = 1 AND `AD` = 0 AND `container` = 0");
                    para_consolidated_viewDataProvider.refresh();
                    break;
                case 6:
                    log("Case 6");
                    para_consolidated_viewRowSet1.setCommand(
                            "SELECT * FROM para_consolidated_view " +
                            "WHERE `reserve_chute` = 0 AND `static_line` = 0 AND `lifejacket` = 0 AND `AD` = 1 AND `container` = 0");
                    para_consolidated_viewDataProvider.refresh();
                    break;
                case 7:
                    log("Case 7");
                    para_consolidated_viewRowSet1.setCommand(
                            "SELECT * FROM para_consolidated_view " +
                            "WHERE `reserve_chute` = 0 AND `static_line` = 0 AND `lifejacket` = 0 AND `AD` = 0 AND `container` = 1");
                    para_consolidated_viewDataProvider.refresh();
                    break;

                default:
                    log("Default");
                    para_consolidated_viewRowSet1.setCommand("SELECT * FROM para_consolidated_view");
                    para_consolidated_viewDataProvider.refresh();

            }
        } catch (Exception ex) {
            log(" ERROR - para_packing.Consolidated_Main : Error Description", ex);
            error(" ERROR - " + ex.getMessage());
        }
    }

    public String hyperlink3_action() {
        log("static main");
        getSessionBean1().setViewID(1);
        changeStatement(1);
        return null;
    }

    public String hyperlink10_action() {
        log("overall");
        getSessionBean1().setViewID(0);
        changeStatement(0);
        return null;
    }

    public String hyperlink4_action() {
        log("freefall main");
        getSessionBean1().setViewID(2);
        changeStatement(2);
        return null;
    }

    public String hyperlink5_action() {
        log("static reserve");
        getSessionBean1().setViewID(3);
        changeStatement(3);
        return null;
    }

    public String hyperlink6_action() {
        log("freefall reserve");
        getSessionBean1().setViewID(4);
        changeStatement(4);
        return null;
    }

    public String hyperlink7_action() {
        log("life jacket");
        getSessionBean1().setViewID(5);
        changeStatement(5);
        return null;
    }

    public String hyperlink8_action() {
        log("ad");
        getSessionBean1().setViewID(6);
        changeStatement(6);
        return null;
    }

    public String hyperlink9_action() {
        log("container");
        getSessionBean1().setViewID(7);
        changeStatement(7);
        return null;
    }
}

