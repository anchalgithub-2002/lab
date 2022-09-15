//program to display the number of characters,lines and words in a text file.....
import java.io.*;
class File
{
	public static void main(String args[]){
		try
		{
			int lines=0,chars=0,words=0;
			int code=0;
			//FileInputStream is used for reading the file..
			FileInputStream f=new FileInputStream("E:\\testfile.txt");
			while(f.available()!=0)
			{
				code = f.read();
                if(code!=10)		
                chars++;
                if(code==32)
                words++;
                if(code==13)
				{
					lines++;
					words++;
				}					
			}
				System.out.println("no of character="+chars);
                System.out.println("no of words="+(words+1));
                System.out.println("no. of lines="+(lines+1));
				f.close();
						
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Cannot find the specified file.....");
		}
		catch(IOException i)
		{
			System.out.println("cannot read file.....");
		}
	}
}