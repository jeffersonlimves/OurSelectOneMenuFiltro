package br.com.bean.java;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value="interesseConverter")
public class InteresseConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		// TODO Auto-generated method stub
		System.out.println(">>>>>>>>>>getAsObject>>>>>>>>>>>>>>>>>>"+arg2);
		if(arg2 != null){
			for (Interesse interesse : PerfilUsuarioBean.INTERESSES) {
				if(arg2.equals(interesse.getNomeIcone())){
					return interesse;
				}
			}
		}
		
		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		    System.out.println(">>>>>>>getAsString>>>>>>>>>>>>>>>>>>>>>"+arg2);
		if(arg2!=null && !arg2.equals("")){
//		if(arg2!=null){
			return ((Interesse)arg2).getNomeIcone();
		}else{
			return "";
		}
		
	}

}
