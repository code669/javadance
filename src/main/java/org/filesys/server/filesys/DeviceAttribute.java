/*
 * Copyright (C) 2006-2010 Alfresco Software Limited.
 *
 * This file is part of Alfresco
 *
 * Alfresco is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Alfresco is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Alfresco. If not, see <http://www.gnu.org/licenses/>.
 */

package org.filesys.server.filesys;

/**
 * Device Attribute Constants Class
 *
 * <p>Specifies the constants that can be used to set the DiskDeviceContext device attributes.
 *
 * @author gkspencer
 */
public final class DeviceAttribute {

    //	Device attributes
    public static final int Removable   = 0x0001;
    public static final int ReadOnly    = 0x0002;
    public static final int FloppyDisk  = 0x0004;
    public static final int WriteOnce   = 0x0008;
    public static final int Remote      = 0x0010;
    public static final int Mounted     = 0x0020;
    public static final int Virtual     = 0x0040;
}
