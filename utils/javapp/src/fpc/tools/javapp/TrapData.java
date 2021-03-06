/*
 * Copyright (c) 2002, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
/*
 * Portions Copyright (c) 2011 Jonas Maebe
 */


package fpc.tools.javapp;

import java.util.*;
import java.io.*;

/**
 * Stores exception table data in code attribute.
 *
 * @author  Sucheta Dambalkar (Adopted code from jdis)
 */
class TrapData {
    short start_pc, end_pc, handler_pc, catch_cpx;
  int num;


    /**
     * Read and store exception table data in code attribute.
     */
    public TrapData(DataInputStream in, int num) throws IOException {
        this.num=num;
        start_pc = in.readShort();
        end_pc=in.readShort();
        handler_pc=in.readShort();
        catch_cpx=in.readShort();
    }

    /**
     * returns recommended identifier
     */
    public String ident() {
        return "t"+num;
    }

}
