/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ryno.tp.immutablewarehouseretailer.model.till;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ryno
 */
public interface register{
    public List<Coins> coinList = new ArrayList<Coins>();
    public List<notes> noteList = new ArrayList<notes>();
}
