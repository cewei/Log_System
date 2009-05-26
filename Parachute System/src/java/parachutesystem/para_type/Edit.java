/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parachutesystem.para_type;

import com.sun.data.provider.RowKey;
import com.sun.data.provider.impl.CachedRowSetDataProvider;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.sql.rowset.CachedRowSetXImpl;
import com.sun.webui.jsf.component.TextField;
import javax.faces.FacesException;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version Edit.java
 * @version Created on May 22, 2009, 10:00:10 AM
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
        para_typeRowSet.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
        para_typeRowSet.setCommand("SELECT * FROM para_type");
        para_typeRowSet.setTableName("para_type");
        para_typeDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{para_type$Edit.para_typeRowSet}"));
    }
    private CachedRowSetDataProvider para_typeDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getPara_typeDataProvider() {
        return para_typeDataProvider;
    }

    public void setPara_typeDataProvider(CachedRowSetDataProvider crsdp) {
        this.para_typeDataProvider = crsdp;
    }
    private TextField typePrefixText = new TextField();

    public TextField getTypePrefixText() {
        return typePrefixText;
    }

    public void setTypePrefixText(TextField tf) {
        this.typePrefixText = tf;
    }
    private TextField nameText = new TextField();

    public TextField getNameText() {
        return nameText;
    }

    public void setNameText(TextField tf) {
        this.nameText = tf;
    }
    private TextField lifeSpanText = new TextField();

    public TextField getLifeSpanText() {
        return lifeSpanText;
    }

    public void setLifeSpanText(TextField tf) {
        this.lifeSpanText = tf;
    }
    private TextField maxJumpText = new TextField();

    public TextField getMaxJumpText() {
        return maxJumpText;
    }

    public void setMaxJumpText(TextField tf) {
        this.maxJumpText = tf;
    }
    private TextField repackCycleText = new TextField();

    public TextField getRepackCycleText() {
        return repackCycleText;
    }

    public void setRepackCycleText(TextField tf) {
        this.repackCycleText = tf;
    }
    private CachedRowSetXImpl para_typeRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getPara_typeRowSet() {
        return para_typeRowSet;
    }

    public void setPara_typeRowSet(CachedRowSetXImpl crsxi) {
        this.para_typeRowSet = crsxi;
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
        // Retrieve Value from Application
        // An example of retrieving an object's value from the Request scope
        // This retrieves the String object myReqValue using the key "name" from the Application
        RowKey myReqValue = (RowKey) getValue("#{sessionScope.type_no}");
        para_typeDataProvider.setCursorRow(myReqValue);
        para_typeDataProvider.refresh();
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
        para_typeDataProvider.close();
    }

    public String edit_action() {
        try {
            RowKey myReqValue = (RowKey) getValue("#{sessionScope.type_no}");
            para_typeDataProvider.setCursorRow(myReqValue);
            para_typeDataProvider.setValue("type_prefix", typePrefixText.getText());
            para_typeDataProvider.setValue("PARA_TYPE.NAME", nameText.getText());
            para_typeDataProvider.setValue("PARA_TYPE.LIFE_SPAN", lifeSpanText.getText());
            para_typeDataProvider.setValue("PARA_TYPE.MAX_JUMP", maxJumpText.getText());
            para_typeDataProvider.setValue("PARA_TYPE.REPACK_CYCLE", repackCycleText.getText());
            // set values of other fields, if any
            para_typeDataProvider.commitChanges();
            para_typeDataProvider.refresh();

        } catch (Exception ex) {
            log("Error Description", ex);
            error(ex.getMessage());
        }
        return "case1";
    }
}

