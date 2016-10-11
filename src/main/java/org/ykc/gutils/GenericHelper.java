/*
 * Copyright (C) 2016 teju <tejendersheoran@gmail.com>
 * See license file for more information
*/
package org.ykc.gutils;


public class GenericHelper {
	 public static boolean is_char_hex(char c)
     {
         return ((c >= '0') && (c <= '9')) || ((c >= 'a') && (c <= 'f')) || ((c >= 'A') && (c <= 'F'));
     }

     public static boolean is_char_binary(char c)
     {
         return ((c == '0') || (c == '1'));
     }

     public static byte uint16_get_lsb(int input)
     {
         return (byte)(input & 0xFF);
     }
     public static byte uint16_get_msb(int input)
     {
         return (byte)(input >>> 8);
     }

     public static byte uint32_get_b0(Long input)
     {
         return (byte)(input & 0xFF);
     }
     public static byte uint32_get_b1(Long input)
     {
         return (byte)((input >>> 8) & 0xFF);
     }
     public static byte uint32_get_b2(Long input)
     {
         return (byte)((input >>> 16) & 0xFF);
     }
     public static byte uint32_get_b3(Long input)
     {
         return (byte)((input >>> 24) & 0xFF);
     }
     public static int get_uint32(byte b0, byte b1, byte b2, byte b3)
     {
    	 return ((b0 & 0xFF) | ((b1 & 0xFF) << 8) | ((b2 & 0xFF) << 16) | ((b3 & 0xFF) << 24));
     }
     public static short get_uint16(byte b0, byte b1)
     {
         return (short) ((b0 & 0xFF) | ((b1 & 0xFF) << 8));
     }

	 public static int byteToInt(byte b0, byte b1, byte b2, byte b3)
     {
         return ((b0 & 0xFF) | ((b1 & 0xFF) << 8) | ((b2 & 0xFF) << 16) | ((b3 & 0xFF) << 24));
     }

	 public static long getUnsignedInt(int x) {
		    return x & 0x00000000ffffffffL;
		}
}
