/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dovetail.evo.analytics.model;

import com.dovetail.common.eis.model.Storable;
import com.dovetail.common.json.JsonCompatible;
import com.dovetail.common.model.ModelObject;
import com.dovetail.common.xml.XMLCompatible;
import java.io.Serializable;

/**
 *
 * @author jk2571
 */
public interface AnalyticsModel extends Storable, ModelObject, JsonCompatible, XMLCompatible, Serializable {
    
}
