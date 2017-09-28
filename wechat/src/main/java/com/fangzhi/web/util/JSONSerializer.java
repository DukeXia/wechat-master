/*
 * -----------------------------------------------------------------------------
 * --------------------------------- JSONSerializer
 *
 * @date 2016-04-21
 * 
 * @author xiadk
 * -----------------------------------------------------------------------------
 * -------------------------------
 */

package com.fangzhi.web.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.IOUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

// Class
// --------------------------------------------------------------------------------------------------------
public class JSONSerializer {
	// Constant(s)
	// ----------------------------------------------------------------------------------------------
	private static final Charset UTF8 = Charset.forName( "UTF-8" );

	// Method(s)
	// ------------------------------------------------------------------------------------------------
	public static String serialize( Object object ) {
		return ( object == null ) ? null : JSON.toJSONString( object, SerializerFeature.WriteEnumUsingToString );
	}

	public static boolean serializeToFile( Object object, String filename ) {
		if ( object == null || filename == null ) return false;

		String json = serialize( object );
		if ( json == null ) return false;

		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream( filename );
			IOUtils.write( json, fos );
		} catch ( FileNotFoundException e ) {
			e.printStackTrace();
			return false;
		} catch ( IOException e ) {
			e.printStackTrace();
			return false;
		} finally {
			if ( fos != null ) {
				try {
					fos.close();
				} catch ( IOException e ) {
					e.printStackTrace();
				} finally {
					fos = null;
				}
			}
		}

		return true;
	}

	public static <T> T unserialize( String text, Class<T> c1ass ) {
		return ( text == null || c1ass == null ) ? null : JSON.parseObject( text, c1ass );
	}

	public static <T> T unserializeFromFile( String filename, Class<T> c1ass ) {
		if ( filename == null || c1ass == null ) return null;

		FileInputStream fis = null;
		String json = null;
		try {
			fis = new FileInputStream( filename );
			json = IOUtils.toString( fis );
		} catch ( FileNotFoundException e ) {
			e.printStackTrace();
			return null;
		} catch ( IOException e ) {
			e.printStackTrace();
			return null;
		} finally {
			if ( fis != null ) {
				try {
					fis.close();
				} catch ( IOException e ) {
					e.printStackTrace();
				} finally {
					fis = null;
				}
			}
		}

		return unserialize( json, c1ass );
	}
}
