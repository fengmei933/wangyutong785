import com.sun.content.server.validation.adapter.*; 
import java.io.FileOutputStream; 
import java.util.Properties; 
 
public class ExportToFileValidationAdapter 
extends ValidationAdapter 
{ 
  public ValidationContent execute( 
    ValidationContent content, Properties properties) 
  throws Exception 
  { 
    // Export if the filename is specified 
