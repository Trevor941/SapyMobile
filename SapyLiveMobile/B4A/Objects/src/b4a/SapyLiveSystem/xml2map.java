package b4a.SapyLiveSystem;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class xml2map extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.SapyLiveSystem.xml2map");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.SapyLiveSystem.xml2map.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.SaxParser _parser = null;
public anywheresoftware.b4a.objects.collections.List _elements = null;
public boolean _mstripnamespaces = false;
public b4a.example.dateutils _dateutils = null;
public b4a.SapyLiveSystem.main _main = null;
public b4a.SapyLiveSystem.starter _starter = null;
public b4a.SapyLiveSystem.b4xpages _b4xpages = null;
public b4a.SapyLiveSystem.b4xcollections _b4xcollections = null;
public b4a.SapyLiveSystem.httputils2service _httputils2service = null;
public b4a.SapyLiveSystem.xuiviewsutils _xuiviewsutils = null;
public static class _xmlelement{
public boolean IsInitialized;
public String Name;
public anywheresoftware.b4a.objects.collections.List Children;
public String Text;
public anywheresoftware.b4a.objects.collections.Map Attributes;
public void Initialize() {
IsInitialized = true;
Name = "";
Children = new anywheresoftware.b4a.objects.collections.List();
Text = "";
Attributes = new anywheresoftware.b4a.objects.collections.Map();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private parser As SaxParser";
_parser = new anywheresoftware.b4a.objects.SaxParser();
 //BA.debugLineNum = 5;BA.debugLine="Type XmlElement (Name As String, Children As List";
;
 //BA.debugLineNum = 6;BA.debugLine="Private elements As List";
_elements = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 7;BA.debugLine="Private mStripNamespaces As Boolean";
_mstripnamespaces = false;
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public b4a.SapyLiveSystem.xml2map._xmlelement  _createelement(String _name) throws Exception{
b4a.SapyLiveSystem.xml2map._xmlelement _xe = null;
 //BA.debugLineNum = 68;BA.debugLine="Private Sub CreateElement (Name As String) As XmlE";
 //BA.debugLineNum = 69;BA.debugLine="Dim xe As XmlElement";
_xe = new b4a.SapyLiveSystem.xml2map._xmlelement();
 //BA.debugLineNum = 70;BA.debugLine="xe.Initialize";
_xe.Initialize();
 //BA.debugLineNum = 71;BA.debugLine="xe.Children.Initialize";
_xe.Children /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 //BA.debugLineNum = 72;BA.debugLine="xe.Name = Name";
_xe.Name /*String*/  = _name;
 //BA.debugLineNum = 78;BA.debugLine="Return xe";
if (true) return _xe;
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return null;
}
public Object  _elementtoobject(b4a.SapyLiveSystem.xml2map._xmlelement _element) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
b4a.SapyLiveSystem.xml2map._xmlelement _child = null;
Object _childobject = null;
Object _currentitem = null;
anywheresoftware.b4a.objects.collections.List _list = null;
 //BA.debugLineNum = 42;BA.debugLine="Private Sub ElementToObject (Element As XmlElement";
 //BA.debugLineNum = 43;BA.debugLine="If Element.Children.Size = 0 And Element.Attribut";
if (_element.Children /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0 && _element.Attributes /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
if (true) return (Object)(_element.Text /*String*/ );};
 //BA.debugLineNum = 44;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 45;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 46;BA.debugLine="If Element.Attributes.IsInitialized Then m.Put(\"A";
if (_element.Attributes /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()) { 
_m.Put((Object)("Attributes"),(Object)(_element.Attributes /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));};
 //BA.debugLineNum = 47;BA.debugLine="If Element.Children.Size = 0 Then m.Put(\"Text\", E";
if (_element.Children /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
_m.Put((Object)("Text"),(Object)(_element.Text /*String*/ ));};
 //BA.debugLineNum = 48;BA.debugLine="For Each child As XmlElement In Element.Children";
{
final anywheresoftware.b4a.BA.IterableList group6 = _element.Children /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_child = (b4a.SapyLiveSystem.xml2map._xmlelement)(group6.Get(index6));
 //BA.debugLineNum = 49;BA.debugLine="Dim childObject As Object = ElementToObject(chil";
_childobject = _elementtoobject(_child);
 //BA.debugLineNum = 50;BA.debugLine="If m.ContainsKey(child.Name) Then";
if (_m.ContainsKey((Object)(_child.Name /*String*/ ))) { 
 //BA.debugLineNum = 51;BA.debugLine="Dim currentItem As Object = m.Get(child.Name)";
_currentitem = _m.Get((Object)(_child.Name /*String*/ ));
 //BA.debugLineNum = 52;BA.debugLine="Dim list As List";
_list = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 53;BA.debugLine="If currentItem Is List Then";
if (_currentitem instanceof java.util.List) { 
 //BA.debugLineNum = 54;BA.debugLine="list = currentItem";
_list = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_currentitem));
 }else {
 //BA.debugLineNum = 56;BA.debugLine="list.Initialize";
_list.Initialize();
 //BA.debugLineNum = 57;BA.debugLine="list.Add(currentItem)";
_list.Add(_currentitem);
 //BA.debugLineNum = 58;BA.debugLine="m.Put(child.Name, list)";
_m.Put((Object)(_child.Name /*String*/ ),(Object)(_list.getObject()));
 };
 //BA.debugLineNum = 60;BA.debugLine="list.Add(childObject)";
_list.Add(_childobject);
 }else {
 //BA.debugLineNum = 62;BA.debugLine="m.Put(child.Name, childObject)";
_m.Put((Object)(_child.Name /*String*/ ),_childobject);
 };
 }
};
 //BA.debugLineNum = 65;BA.debugLine="Return m";
if (true) return (Object)(_m.getObject());
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public b4a.SapyLiveSystem.xml2map._xmlelement  _getlastelement() throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Private Sub GetLastElement As XmlElement";
 //BA.debugLineNum = 128;BA.debugLine="Return elements.Get(elements.Size - 1)";
if (true) return (b4a.SapyLiveSystem.xml2map._xmlelement)(_elements.Get((int) (_elements.getSize()-1)));
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public boolean  _getstripnamespaces() throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Public Sub getStripNamespaces As Boolean";
 //BA.debugLineNum = 20;BA.debugLine="Return mStripNamespaces";
if (true) return _mstripnamespaces;
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return false;
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 11;BA.debugLine="parser.Initialize";
_parser.Initialize(ba);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _parse(String _xml) throws Exception{
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
byte[] _b = null;
 //BA.debugLineNum = 27;BA.debugLine="Public Sub Parse(XML As String) As Map";
 //BA.debugLineNum = 28;BA.debugLine="Dim in As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Dim b() As Byte = XML.GetBytes(\"UTF8\")";
_b = _xml.getBytes("UTF8");
 //BA.debugLineNum = 30;BA.debugLine="in.InitializeFromBytesArray(b, 0, b.Length)";
_in.InitializeFromBytesArray(_b,(int) (0),_b.length);
 //BA.debugLineNum = 31;BA.debugLine="Return Parse2(in)";
if (true) return _parse2(_in);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _parse2(anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _input) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 34;BA.debugLine="Public Sub Parse2(Input As InputStream) As Map";
 //BA.debugLineNum = 35;BA.debugLine="elements.Initialize";
_elements.Initialize();
 //BA.debugLineNum = 36;BA.debugLine="elements.Add(CreateElement(\"stub\"))";
_elements.Add((Object)(_createelement("stub")));
 //BA.debugLineNum = 37;BA.debugLine="parser.Parse(Input, \"parser\")";
_parser.Parse((java.io.InputStream)(_input.getObject()),"parser");
 //BA.debugLineNum = 38;BA.debugLine="Dim m As Map = ElementToObject(elements.Get(0))";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_elementtoobject((b4a.SapyLiveSystem.xml2map._xmlelement)(_elements.Get((int) (0))))));
 //BA.debugLineNum = 39;BA.debugLine="Return m";
if (true) return _m;
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public String  _parser_endelement(String _uri,String _name,anywheresoftware.b4a.keywords.StringBuilderWrapper _text) throws Exception{
b4a.SapyLiveSystem.xml2map._xmlelement _element = null;
 //BA.debugLineNum = 131;BA.debugLine="Private Sub Parser_EndElement (Uri As String, Name";
 //BA.debugLineNum = 132;BA.debugLine="Dim Element As XmlElement = GetLastElement";
_element = _getlastelement();
 //BA.debugLineNum = 133;BA.debugLine="Element.Text = Text.ToString";
_element.Text /*String*/  = _text.ToString();
 //BA.debugLineNum = 134;BA.debugLine="elements.RemoveAt(elements.Size - 1)";
_elements.RemoveAt((int) (_elements.getSize()-1));
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return "";
}
public String  _parser_startelement(String _uri,String _name,anywheresoftware.b4a.objects.SaxParser.AttributesWrapper _attributes) throws Exception{
b4a.SapyLiveSystem.xml2map._xmlelement _element = null;
anywheresoftware.b4a.objects.collections.Map _att = null;
int _i = 0;
String _key = "";
 //BA.debugLineNum = 85;BA.debugLine="Private Sub Parser_StartElement (Uri As String, Na";
 //BA.debugLineNum = 87;BA.debugLine="Dim Element As XmlElement = CreateElement(Name)";
_element = _createelement(_name);
 //BA.debugLineNum = 88;BA.debugLine="If Attributes.IsInitialized And Attributes.Size >";
if (_attributes.IsInitialized() && _attributes.getSize()>0) { 
 //BA.debugLineNum = 89;BA.debugLine="Dim att As Map";
_att = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 101;BA.debugLine="att.Initialize";
_att.Initialize();
 //BA.debugLineNum = 102;BA.debugLine="For i = 0 To Attributes.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_attributes.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
 //BA.debugLineNum = 103;BA.debugLine="Dim key As String = Attributes.GetName(i)";
_key = _attributes.GetName(_i);
 //BA.debugLineNum = 104;BA.debugLine="If mStripNamespaces Then key = StripNamespace(k";
if (_mstripnamespaces) { 
_key = _stripnamespace(_key);};
 //BA.debugLineNum = 105;BA.debugLine="att.Put(key, Attributes.GetValue(i))";
_att.Put((Object)(_key),(Object)(_attributes.GetValue(_i)));
 }
};
 //BA.debugLineNum = 108;BA.debugLine="Element.Attributes = att";
_element.Attributes /*anywheresoftware.b4a.objects.collections.Map*/  = _att;
 };
 //BA.debugLineNum = 110;BA.debugLine="GetLastElement.Children.Add(Element)";
_getlastelement().Children /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_element));
 //BA.debugLineNum = 111;BA.debugLine="elements.Add(Element)";
_elements.Add((Object)(_element));
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return "";
}
public String  _setstripnamespaces(boolean _b) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Public Sub setStripNamespaces (b As Boolean)";
 //BA.debugLineNum = 24;BA.debugLine="mStripNamespaces = b";
_mstripnamespaces = _b;
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return "";
}
public String  _stripnamespace(String _s) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Private Sub StripNamespace(s As String) As String";
 //BA.debugLineNum = 116;BA.debugLine="Return s";
if (true) return _s;
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
