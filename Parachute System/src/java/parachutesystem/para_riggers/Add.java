/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parachutesystem.para_riggers;

import com.sun.data.provider.RowKey;
import com.sun.data.provider.impl.CachedRowSetDataProvider;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.sql.rowset.CachedRowSetXImpl;
import com.sun.webui.jsf.component.Calendar;
import com.sun.webui.jsf.component.Checkbox;
import com.sun.webui.jsf.component.TextField;
import javax.faces.FacesException;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version Add.java
 * @version Created on Jun 10, 2009, 10:08:10 AM
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
        log("<<Entering para_riggers Add>>");
        para_riggersDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{para_riggers$Add.para_riggersRowSet}"));
        para_riggersRowSet.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
        para_riggersRowSet.setCommand("SELECT * FROM para_riggers");
        para_riggersRowSet.setTableName("para_riggers");
    }
    private CachedRowSetDataProvider para_riggersDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getPara_riggersDataProvider() {
        return para_riggersDataProvider;
    }

    public void setPara_riggersDataProvider(CachedRowSetDataProvider crsdp) {
        this.para_riggersDataProvider = crsdp;
    }
    private CachedRowSetXImpl para_riggersRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getPara_riggersRowSet() {
        return para_riggersRowSet;
    }

    public void setPara_riggersRowSet(CachedRowSetXImpl crsxi) {
        this.para_riggersRowSet = crsxi;
    }
    private TextField nricTF = new TextField();

    public TextField getNricTF() {
        return nricTF;
    }

    public void setNricTF(TextField tf) {
        this.nricTF = tf;
    }
    private TextField nameTF = new TextField();

    public TextField getNameTF() {
        return nameTF;
    }

    public void setNameTF(TextField tf) {
        this.nameTF = tf;
    }
    private TextField rankTF = new TextField();

    public TextField getRankTF() {
        return rankTF;
    }

    public void setRankTF(TextField tf) {
        this.rankTF = tf;
    }
    private Checkbox riggerCB = new Checkbox();

    public Checkbox getRiggerCB() {
        return riggerCB;
    }

    public void setRiggerCB(Checkbox c) {
        this.riggerCB = c;
    }
    private Checkbox inspectorCB = new Checkbox();

    public Checkbox getInspectorCB() {
        return inspectorCB;
    }

    public void setInspectorCB(Checkbox c) {
        this.inspectorCB = c;
    }
    private Calendar calendar1 = new Calendar();

    public Calendar getCalendar1() {
        return calendar1;
    }

    public void setCalendar1(Calendar c) {
        this.calendar1 = c;
    }
    private Checkbox checkerCB = new Checkbox();

    public Checkbox getCheckerCB() {
        return checkerCB;
    }

    public void setCheckerCB(Checkbox c) {
        this.checkerCB = c;
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
        para_riggersDataProvider.close();
    }

    public String add_action() {
        try {
            if (para_riggersDataProvider.canAppendRow()) {
                RowKey appendedRow = para_riggersDataProvider.appendRow();
                if (appendedRow != null) {
                    para_riggersDataProvider.setCursorRow(appendedRow);
                    para_riggersDataProvider.setValue("para_riggers.nric", nricTF.getText());
                    para_riggersDataProvider.setValue("para_riggers.name", nameTF.getText());
                    para_riggersDataProvider.setValue("para_riggers.rank", rankTF.getText());
                    para_riggersDataProvider.setValue("para_riggers.rigger", riggerCB.getSelected());
                    para_riggersDataProvider.setValue("para_riggers.checker", checkerCB.getSelected());
                    para_riggersDataProvider.setValue("para_riggers.inspector", inspectorCB.getSelected());
                    para_riggersDataProvider.setValue("para_riggers.last_refresher_date", calendar1.getSelectedDate());
                    // set values of other fields, if any
                    para_riggersDataProvider.commitChanges();
                    para_riggersDataProvider.refresh();
                }
                return "addToView";
            } else {
                log(" ERROR - para_riggers.Add : Cannot append row");
                error(" ERROR - Cannot append row");
                return null;
            }
        } catch (Exception ex) {
            log(" ERROR - para_riggers.Add : Error Description ", ex);
            error(" ERROR - " +ex.getMessage());
            return null;
        }
    }
}
