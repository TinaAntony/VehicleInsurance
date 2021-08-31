package reusableComponents;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class commonMethods {
	
	public void selectDropDownOptions(WebElement element, String strValuetobeSelected) throws Exception
	{
		Select DropDownValue = new Select(element);
		try {
			DropDownValue.selectByVisibleText(strValuetobeSelected);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new Exception("Value is not present for webelement: "+element+" and value is to be selected is :"+strValuetobeSelected);
		}
	}
	
	public void selectRadioButtonValue(List<WebElement> element, String strValuetobeSelected)
	{
		for (WebElement Ref:element)
		{
			if (Ref.getText().equalsIgnoreCase(strValuetobeSelected))
			{
				Ref.click();
				break;
			}
		}
	}
	
	//Select the check box single or multiple selection
	public void selectCheckBox(List<WebElement> element, String strValuetobeSelected)
	{
		String[] checkboxArray = strValuetobeSelected.split(",");
		for (String strValue:checkboxArray)
		{
			for (WebElement Ref:element)
			{
				if (Ref.getText().equalsIgnoreCase(strValue))
				{
					Ref.click();
					break;
				}
			}
		}
	}

}
