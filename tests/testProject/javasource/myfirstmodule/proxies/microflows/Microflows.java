// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the MyFirstModule module
	public static myfirstmodule.proxies.TagNPE dS_CreateOneTagNPE(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("MyFirstModule.DS_CreateOneTagNPE").withParams(params).execute(context);
		return result == null ? null : myfirstmodule.proxies.TagNPE.initialize(context, result);
	}
	public static myfirstmodule.proxies.Tag sUB_GetOrCreateTag(IContext context, java.lang.String _tagLabel)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TagLabel", _tagLabel);
		IMendixObject result = (IMendixObject)Core.microflowCall("MyFirstModule.SUB_GetOrCreateTag").withParams(params).execute(context);
		return result == null ? null : myfirstmodule.proxies.Tag.initialize(context, result);
	}
	public static java.util.List<myfirstmodule.proxies.Tag> widget_GetCurrentTags(IContext context, myfirstmodule.proxies.Entity _entity)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Entity", _entity == null ? null : _entity.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("MyFirstModule.Widget_GetCurrentTags").withParams(params).execute(context);
		java.util.List<myfirstmodule.proxies.Tag> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(myfirstmodule.proxies.Tag.initialize(context, obj));
		}
		return result;
	}
	public static void widget_RemoveAllTags(IContext context, myfirstmodule.proxies.Entity _entity)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Entity", _entity == null ? null : _entity.getMendixObject());
		Core.microflowCall("MyFirstModule.Widget_RemoveAllTags").withParams(params).execute(context);
	}
	public static void widget_RemoveTag(IContext context, myfirstmodule.proxies.Entity _entity, myfirstmodule.proxies.TagNPE _tagNPE)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Entity", _entity == null ? null : _entity.getMendixObject());
		params.put("TagNPE", _tagNPE == null ? null : _tagNPE.getMendixObject());
		Core.microflowCall("MyFirstModule.Widget_RemoveTag").withParams(params).execute(context);
	}
	public static void widget_SelectOrCreateTag(IContext context, myfirstmodule.proxies.Entity _entity, myfirstmodule.proxies.TagNPE _tagNPE)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Entity", _entity == null ? null : _entity.getMendixObject());
		params.put("TagNPE", _tagNPE == null ? null : _tagNPE.getMendixObject());
		Core.microflowCall("MyFirstModule.Widget_SelectOrCreateTag").withParams(params).execute(context);
	}
}