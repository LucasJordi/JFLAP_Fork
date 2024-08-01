/*
 *  JFLAP - Formal Languages and Automata Package
 * 
 * 
 *  Susan H. Rodger
 *  Computer Science Department
 *  Duke University
 *  August 27, 2009

 *  Copyright (c) 2002-2009
 *  All rights reserved.

 *  JFLAP is open source software. Please see the LICENSE for terms.
 *
 */





// I lifted this code directly from
// http://www.codeguru.com/java/articles/122.shtml.
// JMultiLineToolTip.java
package gui;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.CellRendererPane;
import javax.swing.JComponent;
import javax.swing.JTextArea;
import javax.swing.JToolTip;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicToolTipUI;

/**
 * @author Zafir Anjum
 */

public class JMultiLineToolTip extends JToolTip {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final String uiClassID = "ToolTipUI";

	String tipText;

	JComponent component;

	public JMultiLineToolTip() {
		updateUI();
	}

	public void updateUI() {
		setUI(MultiLineToolTipUI.createUI(this));
	}

	public void setColumns(int columns) {
		this.columns = columns;
		this.fixedwidth = 0;
	}

	public int getColumns() {
		return columns;
	}

	public void setFixedWidth(int width) {
		this.fixedwidth = width;
		this.columns = 0;
	}

	public int getFixedWidth() {
		return fixedwidth;
	}

	protected int columns = 0;

	protected int fixedwidth = 0;
}

