// Generated by Haxe 4.0.0-preview.5+7eb789f54
package haxe.lang;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class VarArgsFunction extends haxe.lang.VarArgsBase
{
	public VarArgsFunction(haxe.lang.Function fun)
	{
		//line 54 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Function.hx"
		super(-1, -1);
		//line 55 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Function.hx"
		this.fun = fun;
	}
	
	
	public haxe.lang.Function fun;
	
	@Override public java.lang.Object __hx_invokeDynamic(java.lang.Object[] dynArgs)
	{
		//line 60 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Function.hx"
		return ((java.lang.Object) (this.fun.__hx_invoke1_o(0.0, ((haxe.root.Array<java.lang.Object>) (haxe.root.Array.ofNative(((java.lang.Object[]) (dynArgs) ))) ))) );
	}
	
	
}


