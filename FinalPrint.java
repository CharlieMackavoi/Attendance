import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.util.ArrayUtil;


public class Main {
	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		int[] Numbers = new int[500];
		String fileToBeRead="C:/Users/Good Times/Desktop/ProgramAttendance/HWY18.xls";
		
		HSSFWorkbook workbookHWY18 = new HSSFWorkbook(new FileInputStream(fileToBeRead));
		HSSFSheet sheet = workbookHWY18.getSheet("Sheet1");
		int input;

		HSSFRow row = sheet.getRow(0);
		int i = 0;
		int total = 0;
		do{
			HSSFCell cell18 = row.getCell((short)i);
			input = (int) cell18.getNumericCellValue();
			if(input != 999999){
				Numbers[total] = input;
				total++;
			}
			i++;
		}while(input != 999999);
		
///////////////////////////////////////////////////////////////////////////////////////////////
		
		fileToBeRead="C:/Users/Good Times/Desktop/ProgramAttendance/TT.xls";
		
		HSSFWorkbook workbookTT = new HSSFWorkbook(new FileInputStream(fileToBeRead));
		HSSFSheet sheetTT = workbookTT.getSheet("Sheet1");

		HSSFRow rowTT = sheetTT.getRow(0);
		int TT = 0;
		do{
			HSSFCell cellTT = rowTT.getCell((short)TT);
			input = (int) cellTT.getNumericCellValue();
			if(input != 999999){
				Numbers[total] = input;
				total++;
			}
			i++;
			TT++;
		}while(input != 999999);
		
		///////////////////////////////////////////////////////////////////////////////////////////////
		
		fileToBeRead="C:/Users/Good Times/Desktop/ProgramAttendance/Brookfield.xls";
		
		HSSFWorkbook workbookBrookfield = new HSSFWorkbook(new FileInputStream(fileToBeRead));
		HSSFSheet sheetBrookfield = workbookBrookfield.getSheet("Sheet1");

		HSSFRow rowBrookfield = sheetBrookfield.getRow(0);
		int Brookfield = 0;
		do{
			HSSFCell cellBrookfield = rowBrookfield.getCell((short)Brookfield);
			input = (int) cellBrookfield.getNumericCellValue();
			if(input != 999999){
				Numbers[total] = input;
				total++;
			}
			i++;
			Brookfield++;
		}while(input != 999999);
///////////////////////////////////////////////////////////////////////////////////////////////
		
		fileToBeRead="C:/Users/Good Times/Desktop/ProgramAttendance/Delafield.xls";
		
		HSSFWorkbook workbookDelafield = new HSSFWorkbook(new FileInputStream(fileToBeRead));
		HSSFSheet sheetDelafield = workbookDelafield.getSheet("Sheet1");

		HSSFRow rowDelafield = sheetDelafield.getRow(0);
		int Delafield = 0;
		do{
			HSSFCell cellDelafield = rowDelafield.getCell((short)Delafield);
			input = (int) cellDelafield.getNumericCellValue();
			if(input != 999999){
				Numbers[total] = input;
				total++;
			}
			i++;
			Delafield++;
		}while(input != 999999);
		
		
		
		String[] ALEAH = new String[20];
		int ALEAHNum = 0;
		String[] ALLI = new String[20];
		int ALLINum = 0;
		String[] ALYSSA = new String[20];
		int ALYSSANum = 0;
		String[] AMY = new String[20];
		int AMYNum = 0;
		String[] ANDREA = new String[20];
		int ANDREANum = 0;
		String[] ANNA = new String[20];
		int ANNANum = 0;
		String[] ANNE = new String[20];
		int ANNENum = 0;
		String[] ASHLEY = new String[50];
		int ASHLEYNum = 0;
		String[] BECCA = new String[20];
		int BECCANum = 0;
		String[] BEN = new String[20];
		int BENNum = 0;
		String[] BRIAN = new String[20];
		int BRIANNum = 0;
		String[] CASSIE = new String[20];
		int CASSIENum = 0;
		String[] CATH = new String[20];
		int CATHNum = 0;
		String[] CHELSEA = new String[20];
		int CHELSEANum = 0;
		String[] CHRIS = new String[20];
		int CHRISNum = 0;
		String[] CLAIRE = new String[20];
		int CLAIRENum = 0;
		String[] DANG = new String[20];
		int DANGNum = 0;
		String[] DANW = new String[20];
		int DANWNum = 0;
		String[] DAVID = new String[20];
		int DAVIDNum = 0;
		String[] DEE = new String[20];
		int DEENum = 0;
		String[] DUSTIN = new String[50];
		int DUSTINNum = 0;
		String[] EMMA = new String[20];
		int EMMANum = 0;
		String[] GRACE = new String[20];
		int GRACENum = 0;
		String[] JUSTIN = new String[20];
		int JUSTINNum = 0;
		String[] KARA = new String[20];
		int KARANum = 0;
		String[] KATIE = new String[20];
		int KATIENum = 0;
		String[] KAYLYN = new String[20];
		int KAYLYNNum = 0;
		String[] KELSEY = new String[20];
		int KELSEYNum = 0;
		String[] KIM = new String[20];
		int KIMNum = 0;
		String[] KIRSTEN = new String[20];
		int KIRSTENNum = 0;
		String[] LAURA = new String[20];
		int LAURANum = 0;
		String[] LAUREN = new String[20];
		int LAURENNum = 0;
		String[] LEAH = new String[20];
		int LEAHNum = 0;
		String[] LIZT = new String[20];
		int LIZTNum = 0;
		String[] LIZ = new String[20];
		int LIZNum = 0;
		String[] MATT = new String[20];
		int MATTNum = 0;
		String[] MEGAN = new String[20];
		int MEGANNum = 0;
		String[] MELISSA = new String[20];
		int MELISSANum = 0;
		String[] MICHELLE = new String[20];
		int MICHELLENum = 0;
		String[] MIKES = new String[20];
		int MIKESNum = 0;
		String[] MIKET = new String[20];
		int MIKETNum = 0;
		String[] MITCH = new String[20];
		int MITCHNum = 0;
		String[] MOLLY = new String[20];
		int MOLLYNum = 0;
		String[] NATHANIEL = new String[20];
		int NATHANIELNum = 0;
		String[] NICK = new String[20];
		int NICKNum = 0;
		String[] PATRICK = new String[20];
		int PATRICKNum = 0;
		String[] PETER = new String[20];
		int PETERNum = 0;
		String[] PJ = new String[20];
		int PJNum = 0;
		String[] RICHARD = new String[20];
		int RICHARDNum = 0;
		String[] ROSS = new String[20];
		int ROSSNum = 0;
		String[] RYAN = new String[20];
		int RYANNum = 0;
		String[] SAM = new String[20];
		int SAMNum = 0;
		String[] SARA = new String[20];
		int SARANum = 0;
		String[] SARAH = new String[20];
		int SARAHNum = 0;
		String[] SEAN = new String[20];
		int SEANNum = 0;
		String[] SHAWN = new String[20];
		int SHAWNNum = 0;
		String[] TOM = new String[20];
		int TOMNum = 0;
		String[] TONY = new String[20];
		int TONYNum = 0;
		String[] WHO = new String[300];
		int WHONum = 0;

		
		fileToBeRead="C:/Users/Good Times/Desktop/ProgramAttendance/Read.xls";
		
		
		HSSFWorkbook workbookRead = new HSSFWorkbook(new FileInputStream(fileToBeRead));
		HSSFSheet sheetRead = workbookRead.getSheet("Sheet1");
		String Counselor;
		String Camper;

		HSSFRow rowRead = sheetRead.getRow(0);

		for(int tot = 0; tot < total; tot++){
			for(int play = 0;play < 650; play++){
				rowRead = sheetRead.getRow(play+1);
				HSSFCell cellRead = rowRead.getCell((short)0);
				input = (int) cellRead.getNumericCellValue();
				if(input == Numbers[tot]){
					cellRead = rowRead.getCell((short) 1);
					Counselor = cellRead.getStringCellValue();
					cellRead = rowRead.getCell((short) 4);
					Camper = cellRead.getStringCellValue();
					
					if(Counselor.equals("ALEAH")){
						ALEAH[ALEAHNum] = Camper;
						ALEAHNum++;
					}
					else if(Counselor.equals("ALLI")){
						ALLI[ALLINum] = Camper;
						ALLINum++;
					}
					else if(Counselor.equals("ALYSSA")){
						ALYSSA[ALYSSANum] = Camper;
						ALYSSANum++;
					}
					else if(Counselor.equals("ANDREA")){
						ANDREA[ANDREANum] = Camper;
						ANDREANum++;
					}
					else if(Counselor.equals("ANNA")){
						ANNA[ANNANum] = Camper;
						ANNANum++;
					}
					else if(Counselor.equals("ANNE")){
						ANNE[ANNENum] = Camper;
						ANNENum++;
					}
					else if(Counselor.equals("AMY")){
						AMY[AMYNum] = Camper;
						AMYNum++;
					}
					else if(Counselor.equals("ASHLEY")){
						ASHLEY[ASHLEYNum] = Camper;
						ASHLEYNum++;
					}
					else if(Counselor.equals("BECCA")){
						BECCA[BECCANum] = Camper;
						BECCANum++;
					}
					else if(Counselor.equals("BEN")){
						BEN[BENNum] = Camper;
						BENNum++;
					}
					else if(Counselor.equals("BRIAN")){
						BRIAN[BRIANNum] = Camper;
						BRIANNum++;
					}
					else if(Counselor.equals("CASSIE")){
						CASSIE[CASSIENum] = Camper;
						CASSIENum++;
					}
					else if(Counselor.equals("Cath")){
						CATH[CATHNum] = Camper;
						CATHNum++;
					}
					else if(Counselor.equals("CHELSEA")){
						CHELSEA[CHELSEANum] = Camper;
						CHELSEANum++;
					}
					else if(Counselor.equals("CHRIS")){
						CHRIS[CHRISNum] = Camper;
						CHRISNum++;
					}
					else if(Counselor.equals("CLAIRE")){
						CLAIRE[CLAIRENum] = Camper;
						CLAIRENum++;
					}
					else if(Counselor.equals("DAN G. ")){
						DANG[DANGNum] = Camper;
						DANGNum++;
					}
					else if(Counselor.equals("DAN W. ")){
						DANW[DANWNum] = Camper;
						DANWNum++;
					}
					else if(Counselor.equals("DAVID")){
						DAVID[DAVIDNum] = Camper;
						DAVIDNum++;
					}
					else if(Counselor.equals("DEE")){
						DEE[DEENum] = Camper;
						DEENum++;
					}
					else if(Counselor.equals("DUSTIN")){
						DUSTIN[DUSTINNum] = Camper;
						DUSTINNum++;
					}
					else if(Counselor.equals("EMMA")){
						EMMA[EMMANum] = Camper;
						EMMANum++;
					}
					else if(Counselor.equals("GRACE")){
						GRACE[GRACENum] = Camper;
						GRACENum++;
					}
					else if(Counselor.equals("JUSTIN")){
						JUSTIN[JUSTINNum] = Camper;
						JUSTINNum++;
					}
					else if(Counselor.equals("KARA")){
						KARA[KARANum] = Camper;
						KARANum++;
					}
					else if(Counselor.equals("KATIE")){
						KATIE[KATIENum] = Camper;
						KATIENum++;
					}
					else if(Counselor.equals("KAYLYN")){
						KAYLYN[KAYLYNNum] = Camper;
						KAYLYNNum++;
					}
					else if(Counselor.equals("KELSEY")){
						KELSEY[KELSEYNum] = Camper;
						KELSEYNum++;
					}
					else if(Counselor.equals("KIM")){
						KIM[KIMNum] = Camper;
						KIMNum++;
					}
					else if(Counselor.equals("KIRSTEN")){
						KIRSTEN[KIRSTENNum] = Camper;
						KIRSTENNum++;
					}
					else if(Counselor.equals("LAURA")){
						LAURA[LAURANum] = Camper;
						LAURANum++;
					}
					else if(Counselor.equals("LAUREN")){
						LAUREN[LAURENNum] = Camper;
						LAURENNum++;
					}
					else if(Counselor.equals("LEAH")){
						LEAH[LEAHNum] = Camper;
						LEAHNum++;
					}
					else if(Counselor.equals("LIZT")){
						LIZT[LIZTNum] = Camper;
						LIZTNum++;
					}
					else if(Counselor.equals("LIZ")){
						LIZ[LIZNum] = Camper;
						LIZNum++;
					}
					else if(Counselor.equals("MATT")){
						MATT[MATTNum] = Camper;
						MATTNum++;
					}
					else if(Counselor.equals("MEGAN")){
						MEGAN[MEGANNum] = Camper;
						MEGANNum++;
					}
					else if(Counselor.equals("MELISSA")){
						MELISSA[MELISSANum] = Camper;
						MELISSANum++;
					}
					else if(Counselor.equals("MICHELLE")){
						MICHELLE[MICHELLENum] = Camper;
						MICHELLENum++;
					}
					else if(Counselor.equals("MIKE S.")){
						MIKES[MIKESNum] = Camper;
						MIKESNum++;
					}
					else if(Counselor.equals("MIKE T.")){
						MIKET[MIKETNum] = Camper;
						MIKETNum++;
					}
					else if(Counselor.equals("MITCH")){
						MITCH[MITCHNum] = Camper;
						MITCHNum++;
					}
					else if(Counselor.equals("MOLLY")){
						MOLLY[MOLLYNum] = Camper;
						MOLLYNum++;
					}
					else if(Counselor.equals("NATHANIEL")){
						NATHANIEL[NATHANIELNum] = Camper;
						NATHANIELNum++;
					}
					else if(Counselor.equals("NICK ")){
						NICK[NICKNum] = Camper;
						NICKNum++;
					}
					else if(Counselor.equals("PATRICK")){
						PATRICK[PATRICKNum] = Camper;
						PATRICKNum++;
					}
					else if(Counselor.equals("PETER")){
						PETER[PETERNum] = Camper;
						PETERNum++;
					}
					else if(Counselor.equals("PJ")){
						PJ[PJNum] = Camper;
						PJNum++;
					}
					else if(Counselor.equals("RICHARD")){
						RICHARD[RICHARDNum] = Camper;
						RICHARDNum++;
					}
					else if(Counselor.equals("ROSS")){
						ROSS[ROSSNum] = Camper;
						ROSSNum++;
					}
					else if(Counselor.equals("RYAN")){
						RYAN[RYANNum] = Camper;
						RYANNum++;
					}
					else if(Counselor.equals("SAM")){
						SAM[SAMNum] = Camper;
						SAMNum++;
					}
					else if(Counselor.equals("SARA")){
						SARA[SARANum] = Camper;
						SARANum++;
					}
					else if(Counselor.equals("SARAH")){
						SARAH[SARAHNum] = Camper;
						SARAHNum++;
					}
					else if(Counselor.equals("SEAN")){
						SEAN[SEANNum] = Camper;
						SEANNum++;
					}
					else if(Counselor.equals("SHAWN")){
						SHAWN[SHAWNNum] = Camper;
						SHAWNNum++;
					}
					else if(Counselor.equals("TOM")){
						TOM[TOMNum] = Camper;
						TOMNum++;
					}
					else if(Counselor.equals("TONY")){
						TONY[TONYNum] = Camper;
						TONYNum++;
					}
					else{
						WHO[WHONum] = Camper;
						WHONum++;
					}
				  break;	
				}
			}
		}
		
		
		int tempNum = ALEAHNum;
		while(tempNum < 20){
			ALEAH[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = ALLINum;
		while(tempNum < 20){
			ALLI[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = ALYSSANum;
		while(tempNum < 20){
			ALYSSA[tempNum] = "zz";
			tempNum++;
		}
		tempNum = AMYNum;
		while(tempNum < 20){
			AMY[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = ANDREANum;
		while(tempNum < 20){
			ANDREA[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = ANNANum;
		while(tempNum < 20){
			ANNA[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = ANNENum;
		while(tempNum < 20){
			ANNE[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = ASHLEYNum;
		while(tempNum < 50){
			ASHLEY[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = BECCANum;
		while(tempNum < 20){
			BECCA[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = BENNum;
		while(tempNum < 20){
			BEN[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = BENNum;
		while(tempNum < 20){
			BEN[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = BRIANNum;
		while(tempNum < 20){
			BRIAN[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = CASSIENum;
		while(tempNum < 20){
			CASSIE[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = CATHNum;
		while(tempNum < 20){
			CATH[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = CHELSEANum;
		while(tempNum < 20){
			CHELSEA[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = CHRISNum;
		while(tempNum < 20){
			CHRIS[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = CLAIRENum;
		while(tempNum < 20){
			CLAIRE[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = DANGNum;
		while(tempNum < 20){
			DANG[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = DANWNum;
		while(tempNum < 20){
			DANW[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = DAVIDNum;
		while(tempNum < 20){
			DAVID[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = DUSTINNum;
		while(tempNum < 50){
			DUSTIN[tempNum] = "zz";
			tempNum++;
		}
		tempNum = EMMANum;
		while(tempNum < 20){
			EMMA[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = GRACENum;
		while(tempNum < 20){
			GRACE[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = JUSTINNum;
		while(tempNum < 20){
			JUSTIN[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = KARANum;
		while(tempNum < 20){
			KARA[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = KATIENum;
		while(tempNum < 20){
			KATIE[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = KAYLYNNum;
		while(tempNum < 20){
			KAYLYN[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = KELSEYNum;
		while(tempNum < 20){
			KELSEY[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = KIMNum;
		while(tempNum < 20){
			KIM[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = KIRSTENNum;
		while(tempNum < 20){
			KIRSTEN[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = LAURANum;
		while(tempNum < 20){
			LAURA[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = LAURENNum;
		while(tempNum < 20){
			LAUREN[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = LEAHNum;
		while(tempNum < 20){
			LEAH[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = LIZTNum;
		while(tempNum < 20){
			LIZT[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = LIZNum;
		while(tempNum < 20){
			LIZ[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = MATTNum;
		while(tempNum < 20){
			MATT[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = MEGANNum;
		while(tempNum < 20){
			MEGAN[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = MELISSANum;
		while(tempNum < 20){
			MELISSA[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = MICHELLENum;
		while(tempNum < 20){
			MICHELLE[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = MIKESNum;
		while(tempNum < 20){
			MIKES[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = MIKETNum;
		while(tempNum < 20){
			MIKET[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = MITCHNum;
		while(tempNum < 20){
			MITCH[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = MOLLYNum;
		while(tempNum < 20){
			MOLLY[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = NATHANIELNum;
		while(tempNum < 20){
			NATHANIEL[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = NICKNum;
		while(tempNum < 20){
			NICK[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = PATRICKNum;
		while(tempNum < 20){
			PATRICK[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = PETERNum;
		while(tempNum < 20){
			PETER[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = PJNum;
		while(tempNum < 20){
			PJ[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = RICHARDNum;
		while(tempNum < 20){
			RICHARD[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = ROSSNum;
		while(tempNum < 20){
			ROSS[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = RYANNum;
		while(tempNum < 20){
			RYAN[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = SAMNum;
		while(tempNum < 20){
			SAM[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = SARANum;
		while(tempNum < 20){
			SARA[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = SARAHNum;
		while(tempNum < 20){
			SARAH[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = SEANNum;
		while(tempNum < 20){
			SEAN[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = SHAWNNum;
		while(tempNum < 20){
			SHAWN[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = TOMNum;
		while(tempNum < 20){
			TOM[tempNum] = "zz";
			tempNum++;
		}
		
		tempNum = TONYNum;
		while(tempNum < 20){
			TONY[tempNum] = "zz";
			tempNum++;
		}
		Arrays.sort(ALEAH);
		Arrays.sort(ALLI);
		java.util.Arrays.sort(ALYSSA);
		java.util.Arrays.sort(AMY);
		java.util.Arrays.sort(ANDREA);
		java.util.Arrays.sort(ANNA);
		java.util.Arrays.sort(ANNE);
		java.util.Arrays.sort(ASHLEY);
		java.util.Arrays.sort(BECCA);
		java.util.Arrays.sort(BEN);
		java.util.Arrays.sort(BRIAN);
		java.util.Arrays.sort(CASSIE);
		java.util.Arrays.sort(CATH);
		java.util.Arrays.sort(CHELSEA);
		java.util.Arrays.sort(CHRIS);
		java.util.Arrays.sort(CLAIRE);
		java.util.Arrays.sort(DANG);
		java.util.Arrays.sort(DANW);
		java.util.Arrays.sort(DAVID);
		java.util.Arrays.sort(DUSTIN);
		java.util.Arrays.sort(EMMA);
		java.util.Arrays.sort(GRACE);
		java.util.Arrays.sort(JUSTIN);
		java.util.Arrays.sort(KARA);
		java.util.Arrays.sort(KATIE);
		java.util.Arrays.sort(KAYLYN);
		java.util.Arrays.sort(KELSEY);
		java.util.Arrays.sort(KIM);
		java.util.Arrays.sort(KIRSTEN);
		java.util.Arrays.sort(LAURA);
		java.util.Arrays.sort(LAUREN);
		java.util.Arrays.sort(LEAH);
		java.util.Arrays.sort(LIZT);
		java.util.Arrays.sort(LIZ);
		java.util.Arrays.sort(MATT);
		java.util.Arrays.sort(MEGAN);
		java.util.Arrays.sort(MELISSA);
		java.util.Arrays.sort(MICHELLE);
		java.util.Arrays.sort(MIKES);
		java.util.Arrays.sort(MIKET);
		java.util.Arrays.sort(MITCH);
		java.util.Arrays.sort(MOLLY);
		java.util.Arrays.sort(NATHANIEL);
		java.util.Arrays.sort(NICK);
		java.util.Arrays.sort(PATRICK);
		java.util.Arrays.sort(PETER);
		java.util.Arrays.sort(PJ);
		java.util.Arrays.sort(RICHARD);
		java.util.Arrays.sort(ROSS);
		java.util.Arrays.sort(RYAN);
		java.util.Arrays.sort(SAM);
		java.util.Arrays.sort(SARA);
		java.util.Arrays.sort(SARAH);
		java.util.Arrays.sort(SEAN);
		java.util.Arrays.sort(SHAWN);
		java.util.Arrays.sort(TOM);
		java.util.Arrays.sort(TONY);
		
		// Stream to write file
		int pageCounter = 0;
		int Counter = 0;
		FileOutputStream fout;
		int totalCampers = 0;
		Date todaysDate = new java.util.Date();
		SimpleDateFormat formatter = new SimpleDateFormat("EEE, dd-MMM");
		String formattedDate = formatter.format(todaysDate);
		try
		{
		    // Open an output stream
		    fout = new FileOutputStream (formattedDate + ".doc");

		    
		    // Print a line of text
		    String[] C= new String[80]; 
		    System.arraycopy(LAUREN, 0, C, 0, LAUREN.length);
		    System.arraycopy(LAURA, 0, C, LAUREN.length, LAURA.length);
		    System.arraycopy(SARA, 0, C, LAURA.length+LAUREN.length, SARA.length);
		    System.arraycopy(ANNA, 0, C, LAURA.length+LAUREN.length+SARA.length, ANNA.length);
		    java.util.Arrays.sort(C);
		    //////////////////////////////////////////////////////////////////////////////////////////////////
		    totalCampers = (LAURENNum + LAURANum + SARANum + ANNANum);
		    new PrintStream(fout).println ("_________________________");
		    new PrintStream(fout).println ("|   Forever Fun Girls   |      " + formattedDate);
		    new PrintStream(fout).println ("_________________________");
		    new PrintStream(fout).println (" ");
		   pageCounter = pageCounter + 4;
		   for(int FF = 0; FF < totalCampers; FF++){
			   new PrintStream(fout).println(C[FF]);
			   pageCounter++;
		   }
//////////////////////////////////////////////////////////////////////////////////////////////////
		    new PrintStream(fout).println (" ");
			 new PrintStream(fout).println (" ");
			 new PrintStream(fout).println ("Total Campers: " + totalCampers);
			 pageCounter = pageCounter + 3;
		   while(pageCounter >= 54){
			   pageCounter = pageCounter - 54;
		   }
		   Counter = 54 - pageCounter;
		   for(int count = 0; count < Counter; count++){
			   new PrintStream(fout).println (" ");
		   }
  
		   String[] FFB = new String[100];
		   System.arraycopy(TOM, 0, FFB, 0, TOM.length);
		    System.arraycopy(SHAWN, 0, FFB, TOM.length, SHAWN.length);
		    System.arraycopy(ROSS, 0, FFB, TOM.length+SHAWN.length, ROSS.length);
		    System.arraycopy(KARA, 0, FFB, TOM.length+SHAWN.length+ROSS.length, KARA.length);
		    System.arraycopy(SEAN, 0, FFB, TOM.length+SHAWN.length+ROSS.length+KARA.length, SEAN.length);
		    java.util.Arrays.sort(FFB);
/////////////////NEW      PAGE //////////////////***************///////////////////////////////////
						   pageCounter = 0;
						   totalCampers = (TOMNum + SHAWNNum + ROSSNum + KARANum + SEANNum);
						    new PrintStream(fout).println ("_________________________");
						    new PrintStream(fout).println ("|   Forever Fun Boys    |      " + formattedDate);
						    new PrintStream(fout).println ("_________________________");
						    new PrintStream(fout).println (" ");
						   pageCounter = pageCounter + 4;
						   
						   for(int FF = 0; FF < totalCampers; FF++){
							   new PrintStream(fout).println(FFB[FF]);
							   pageCounter++;
						   }
////////////////////////////////////////////////////////////////
new PrintStream(fout).println (" ");
new PrintStream(fout).println (" ");
new PrintStream(fout).println ("Total Campers: " + totalCampers);
pageCounter = pageCounter + 3;
while(pageCounter >= 54){
	   pageCounter = pageCounter - 54;
   }
Counter = 54 - pageCounter;
   for(int count = 0; count < Counter; count++){
	   new PrintStream(fout).println (" ");
   }

   String[] FYG = new String[60];
   System.arraycopy(KIM, 0, FYG, 0, KIM.length);
    System.arraycopy(CLAIRE, 0, FYG, KIM.length, CLAIRE.length);
    System.arraycopy(AMY, 0, FYG, KIM.length+CLAIRE.length, AMY.length);
    java.util.Arrays.sort(FYG);
	   		   
	   /////////////////NEW      PAGE //////////////////***************///////////////////////////////////
					   pageCounter = 0;
					   totalCampers = (KIMNum + CLAIRENum + AMYNum);
					    new PrintStream(fout).println ("_________________________");
					    new PrintStream(fout).println ("|  Forever Young Girls  |      " + formattedDate);
					    new PrintStream(fout).println ("_________________________");
					    new PrintStream(fout).println (" ");
					    pageCounter = pageCounter +4;
					    for(int FF = 0; FF < totalCampers; FF++){
							   new PrintStream(fout).println(FYG[FF]);
							   pageCounter++;
						   }
					    
					    
new PrintStream(fout).println (" ");
new PrintStream(fout).println (" ");
new PrintStream(fout).println ("Total Campers: " + totalCampers);
pageCounter = pageCounter + 3;
while(pageCounter >= 54){
   pageCounter = pageCounter - 54;
}

Counter = 54 - pageCounter;
for(int count = 0; count < Counter; count++){
   new PrintStream(fout).println (" ");
}

String[] FYB = new String[80];
System.arraycopy(PATRICK, 0, FYB, 0, PATRICK.length);
 System.arraycopy(ALYSSA, 0, FYB, PATRICK.length, ALYSSA.length);
 System.arraycopy(KIRSTEN, 0, FYB, PATRICK.length+ALYSSA.length, KIRSTEN.length);
 System.arraycopy(LIZT, 0, FYB, PATRICK.length+ALYSSA.length+KIRSTEN.length, LIZT.length);
 java.util.Arrays.sort(FYB);
	 
  		  			   /////////////////NEW      PAGE //////////////////***************///////////////////////////////////
  						   pageCounter = 0;
  						   totalCampers = (PATRICKNum + ALYSSANum + KIRSTENNum + LIZTNum);
  						    new PrintStream(fout).println ("_________________________");
  						    new PrintStream(fout).println ("|  Forever Young Boys   |      " + formattedDate);
  						    new PrintStream(fout).println ("_________________________");
  						    new PrintStream(fout).println (" ");
  						    
  						  pageCounter = pageCounter +4;
  					    for(int FF = 0; FF < totalCampers; FF++){
  							   new PrintStream(fout).println(FYB[FF]);
  							   pageCounter++;
  						   }
  						    
  new PrintStream(fout).println (" ");
  new PrintStream(fout).println (" ");
  new PrintStream(fout).println ("Total Campers: " + totalCampers);
  pageCounter = pageCounter + 3;   
  while(pageCounter >= 54){
	   pageCounter = pageCounter - 54;
	}
	Counter = 54 - pageCounter;
	for(int count = 0; count < Counter; count++){
	   new PrintStream(fout).println (" ");
	}
		   
	String[] JEG = new String[60];
	System.arraycopy(LIZ, 0, JEG, 0, LIZ.length);
	 System.arraycopy(LEAH, 0, JEG, LIZ.length, LEAH.length);
	 System.arraycopy(MICHELLE, 0, JEG, LIZ.length+LEAH.length, KIRSTEN.length);
	 java.util.Arrays.sort(JEG);
				  		    /////////////////NEW      PAGE //////////////////***************///////////////////////////////////
			 			   pageCounter = 0;
			 			   totalCampers = (LIZNum + LEAHNum + MICHELLENum);
 						    new PrintStream(fout).println ("_________________________");
			  			    new PrintStream(fout).println ("| Junior Explorer Girls |      " + formattedDate);
			  			    new PrintStream(fout).println ("_________________________");
			  			    new PrintStream(fout).println (" ");
			  			    pageCounter = pageCounter + 4;
	  					    for(int FF = 0; FF < totalCampers; FF++){
	  							   new PrintStream(fout).println(JEG[FF]);
	  							   pageCounter++;
	  						   }
			  						    
			  new PrintStream(fout).println (" ");
			  new PrintStream(fout).println (" ");
			  new PrintStream(fout).println ("Total Campers: " + totalCampers);
			  pageCounter = pageCounter + 3;   
			  while(pageCounter >= 54){
				   pageCounter = pageCounter - 54;
				}
				Counter = 54 - pageCounter;
				for(int count = 0; count < Counter; count++){
				   new PrintStream(fout).println (" ");
				}
				String[] JEB = new String[80];
				System.arraycopy(DANW, 0, JEB, 0, DANW.length);
				 System.arraycopy(BEN, 0, JEB, DANW.length, BEN.length);
				 System.arraycopy(DANG, 0, JEB, DANW.length+BEN.length, DANG.length);
				 System.arraycopy(MITCH, 0, JEB, DANW.length+BEN.length+DANG.length, MITCH.length);
				 java.util.Arrays.sort(JEB);
				 
									   /////////////////NEW      PAGE //////////////////***************///////////////////////////////////
			  						   pageCounter = 0;
			  						   totalCampers = (DANWNum + BENNum + DANGNum + MITCHNum);
			  						    new PrintStream(fout).println ("_________________________");
			  						    new PrintStream(fout).println ("| Junior Explorer Boys  |      " + formattedDate);
			  						    new PrintStream(fout).println ("_________________________");
			  						    new PrintStream(fout).println (" ");
			  						  pageCounter = pageCounter + 4;
			  						  
				  					    for(int FF = 0; FF < totalCampers; FF++){
				  							   new PrintStream(fout).println(JEB[FF]);
				  							   pageCounter++;
				  						   }
						  						    
 
			  new PrintStream(fout).println (" ");
			  new PrintStream(fout).println (" ");
			  new PrintStream(fout).println ("Total Campers: " + totalCampers);
			  pageCounter = pageCounter + 3;   
			  while(pageCounter >= 54){
				   pageCounter = pageCounter - 54;
				}
				Counter = 54 - pageCounter;
				for(int count = 0; count < Counter; count++){
				   new PrintStream(fout).println (" ");
				}
				
				String[] SEG = new String[120];
				System.arraycopy(EMMA, 0, SEG, 0, EMMA.length);
				 System.arraycopy(GRACE, 0, SEG, EMMA.length, GRACE.length);
				 System.arraycopy(MELISSA, 0, SEG, EMMA.length+GRACE.length, MELISSA.length);
				 System.arraycopy(MOLLY, 0, SEG, EMMA.length+GRACE.length+MELISSA.length, MOLLY.length);
				 System.arraycopy(KELSEY, 0, SEG, EMMA.length+GRACE.length+MELISSA.length+MOLLY.length, KELSEY.length);
				 System.arraycopy(ANDREA, 0, SEG, EMMA.length+GRACE.length+MELISSA.length+MOLLY.length+KELSEY.length, ANDREA.length);
				 java.util.Arrays.sort(SEG);
				
										   /////////////////NEW      PAGE //////////////////***************///////////////////////////////////
					  						   pageCounter = 0;
					  						   totalCampers = (EMMANum + GRACENum + MELISSANum + MOLLYNum + KELSEYNum + ANDREANum);
					  						    new PrintStream(fout).println ("_________________________");
					  						    new PrintStream(fout).println ("|Seasoned Explorer Girls|      " + formattedDate);
					  						    new PrintStream(fout).println ("_________________________");
					  						    new PrintStream(fout).println (" ");
					  						  pageCounter = pageCounter + 4;
						  					    for(int FF = 0; FF < totalCampers; FF++){
						  							   new PrintStream(fout).println(SEG[FF]);
						  							   pageCounter++;
						  						   }
		 
					  new PrintStream(fout).println (" ");
					  new PrintStream(fout).println (" ");
					  new PrintStream(fout).println ("Total Campers: " + totalCampers);
					  pageCounter = pageCounter + 3;   
					  while(pageCounter >= 54){
						   pageCounter = pageCounter - 54;
						}
						Counter = 54 - pageCounter;
						for(int count = 0; count < Counter; count++){
						   new PrintStream(fout).println (" ");
						}
						String[] SEB = new String[80];
						System.arraycopy(JUSTIN, 0, SEB, 0, JUSTIN.length);
						 System.arraycopy(MATT, 0, SEB, JUSTIN.length, MATT.length);
						 System.arraycopy(PETER, 0, SEB, JUSTIN.length+MATT.length, PETER.length);
						 System.arraycopy(RYAN, 0, SEB, JUSTIN.length+MATT.length+PETER.length, RYAN.length);
						 java.util.Arrays.sort(SEB);
																	   /////////////////NEW      PAGE //////////////////***************///////////////////////////////////
											  						   pageCounter = 0;
											  						   totalCampers = (JUSTINNum + MATTNum + PETERNum + RYANNum);
											  						    new PrintStream(fout).println ("_________________________");
											  						    new PrintStream(fout).println ("|Seasoned Explorer Boys |      " + formattedDate);
											  						    new PrintStream(fout).println ("_________________________");
											  						    new PrintStream(fout).println (" ");
											  						    
											  						  pageCounter = pageCounter + 4;
												  					    for(int FF = 0; FF < totalCampers; FF++){
												  							   new PrintStream(fout).println(SEB[FF]);
												  							   pageCounter++;
												  						   }
												  					    
											  new PrintStream(fout).println (" ");
											  new PrintStream(fout).println (" ");
											  new PrintStream(fout).println ("Total Campers: " + totalCampers);
											  pageCounter = pageCounter + 3;   
											  while(pageCounter >= 54){
												   pageCounter = pageCounter - 54;
												}
												Counter = 54 - pageCounter;
												for(int count = 0; count < Counter; count++){
												   new PrintStream(fout).println (" ");
												}
												String[] RSG = new String[80];
												System.arraycopy(CHELSEA, 0, RSG, 0, CHELSEA.length);
												 System.arraycopy(KAYLYN, 0, RSG, CHELSEA.length, KAYLYN.length);
												 System.arraycopy(BECCA, 0, RSG, CHELSEA.length+KAYLYN.length, BECCA.length);
												 System.arraycopy(ALEAH, 0, RSG, CHELSEA.length+KAYLYN.length+BECCA.length, ALEAH.length);
												 java.util.Arrays.sort(RSG);									      								
							   /////////////////NEW      PAGE //////////////////***************///////////////////////////////////
	  						   pageCounter = 0;
	  						   totalCampers = (CHELSEANum + KAYLYNNum + BECCANum + ALEAHNum);
	  						    new PrintStream(fout).println ("_________________________");
	  						    new PrintStream(fout).println ("|   Rising Star Girls   |      " + formattedDate);
	  						    new PrintStream(fout).println ("_________________________");
	  						    new PrintStream(fout).println (" ");
	  						   
	  						  pageCounter = pageCounter + 4;
		  					    for(int FF = 0; FF < totalCampers; FF++){
		  							   new PrintStream(fout).println(RSG[FF]);
		  							   pageCounter++;
		  						   }
	  new PrintStream(fout).println (" ");
	  new PrintStream(fout).println (" ");
	  new PrintStream(fout).println ("Total Campers: " + totalCampers);
	  pageCounter = pageCounter + 3;   
	  while(pageCounter >= 54){
		   pageCounter = pageCounter - 54;
		}
		Counter = 54 - pageCounter;
		for(int count = 0; count < Counter; count++){
		   new PrintStream(fout).println (" ");
		}
		String[] RSB = new String[80];
		System.arraycopy(MIKES, 0, RSB, 0, MIKES.length);
		 System.arraycopy(DAVID, 0, RSB, MIKES.length, DAVID.length);
		 System.arraycopy(RICHARD, 0, RSB, MIKES.length+DAVID.length, RICHARD.length);
		 System.arraycopy(BRIAN, 0, RSB, MIKES.length+DAVID.length+RICHARD.length, BRIAN.length);
		 java.util.Arrays.sort(RSB);				   
/////////////////NEW      PAGE //////////////////***************///////////////////////////////////
  pageCounter = 0;
  totalCampers = (MIKESNum + DAVIDNum + RICHARDNum + BRIANNum);
   new PrintStream(fout).println ("_________________________");
   new PrintStream(fout).println ("|   Rising Star Boys    |      " + formattedDate);
   new PrintStream(fout).println ("_________________________");
   new PrintStream(fout).println (" ");
   pageCounter = pageCounter + 4;
	    for(int FF = 0; FF < totalCampers; FF++){
			   new PrintStream(fout).println(RSB[FF]);
			   pageCounter++;
		   }

new PrintStream(fout).println (" ");
new PrintStream(fout).println (" ");
new PrintStream(fout).println ("Total Campers: " + totalCampers);
pageCounter = pageCounter + 3;   
while(pageCounter >= 54){
pageCounter = pageCounter - 54;
}
Counter = 54 - pageCounter;
for(int count = 0; count < Counter; count++){
new PrintStream(fout).println (" ");
}

String[] SSG = new String[60];
System.arraycopy(MEGAN, 0, SSG, 0, MEGAN.length);
 System.arraycopy(CASSIE, 0, SSG, MEGAN.length, CASSIE.length);
 System.arraycopy(ALLI, 0, SSG, MEGAN.length+CASSIE.length, ALLI.length);
 java.util.Arrays.sort(SSG);				   
/////////////////NEW      PAGE //////////////////***************///////////////////////////////////
pageCounter = 0;
totalCampers = (MEGANNum + CASSIENum + ALLINum);
 new PrintStream(fout).println ("_________________________");
 new PrintStream(fout).println ("|  Shooting Star Girls  |      " + formattedDate);
 new PrintStream(fout).println ("_________________________");
 new PrintStream(fout).println (" ");
 pageCounter = pageCounter + 4;
 for(int FF = 0; FF < totalCampers; FF++){
		   new PrintStream(fout).println(SSG[FF]);
		   pageCounter++;
	   }

new PrintStream(fout).println (" ");
new PrintStream(fout).println (" ");
new PrintStream(fout).println ("Total Campers: " + totalCampers);
pageCounter = pageCounter + 3;   
while(pageCounter >= 54){
pageCounter = pageCounter - 54;
}
Counter = 54 - pageCounter;
for(int count = 0; count < Counter; count++){
new PrintStream(fout).println (" ");
}

String[] SSB = new String[40];
System.arraycopy(MIKET, 0, SSB, 0, MIKET.length);
 System.arraycopy(CHRIS, 0, SSB, MIKET.length, CHRIS.length);
 java.util.Arrays.sort(SSB);
 
/////////////////NEW      PAGE //////////////////***************///////////////////////////////////
pageCounter = 0;
totalCampers = (MIKETNum + CHRISNum);
 new PrintStream(fout).println ("_________________________");
 new PrintStream(fout).println ("|  Shooting Star Boys   |      " + formattedDate);
 new PrintStream(fout).println ("_________________________");
 new PrintStream(fout).println (" ");
 pageCounter = pageCounter + 4;
 
 for(int FF = 0; FF < totalCampers; FF++){
	   new PrintStream(fout).println(SSB[FF]);
	   pageCounter++;
 }


new PrintStream(fout).println (" ");
new PrintStream(fout).println (" ");
new PrintStream(fout).println ("Total Campers: " + totalCampers);
pageCounter = pageCounter + 3;   
while(pageCounter >= 54){
pageCounter = pageCounter - 54;
}
Counter = 54 - pageCounter;
for(int count = 0; count < Counter; count++){
new PrintStream(fout).println (" ");
}

String[] VG = new String[80];
System.arraycopy(SAM, 0, VG, 0, SAM.length);
 System.arraycopy(SARAH, 0, VG, SAM.length, SARAH.length);
 System.arraycopy(KATIE, 0, VG, SAM.length+SARAH.length, KATIE.length);
 System.arraycopy(ANNE, 0, VG, SAM.length+SARAH.length+KATIE.length, ANNE.length);
 java.util.Arrays.sort(VG);
/////////////////NEW      PAGE //////////////////***************///////////////////////////////////
pageCounter = 0;
totalCampers = (SAMNum + SARAHNum + KATIENum + ANNENum);
 new PrintStream(fout).println ("_________________________");
 new PrintStream(fout).println ("|     Varsity Girls     |      " + formattedDate);
 new PrintStream(fout).println ("_________________________");
 new PrintStream(fout).println (" ");
 pageCounter = pageCounter + 4;
 for(int FF = 0; FF < totalCampers; FF++){
	   new PrintStream(fout).println(VG[FF]);
	   pageCounter++;
}
 
new PrintStream(fout).println (" ");
new PrintStream(fout).println (" ");
new PrintStream(fout).println ("Total Campers: " + totalCampers);
pageCounter = pageCounter + 3;   
while(pageCounter >= 54){
pageCounter = pageCounter - 54;
}
Counter = 54 - pageCounter;
for(int count = 0; count < Counter; count++){
new PrintStream(fout).println (" ");
}


String[] VB = new String[60];
System.arraycopy(PJ, 0, VB, 0, PJ.length);
 System.arraycopy(NICK, 0, VB, PJ.length, NICK.length);
 System.arraycopy(NATHANIEL, 0, VB, PJ.length+NICK.length, NATHANIEL.length);
 java.util.Arrays.sort(VB);
/////////////////NEW      PAGE //////////////////***************///////////////////////////////////
pageCounter = 0;
totalCampers = (PJNum + NICKNum + NATHANIELNum);
 new PrintStream(fout).println ("_________________________");
 new PrintStream(fout).println ("|     Varsity Boys      |      " + formattedDate);
 new PrintStream(fout).println ("_________________________");
 new PrintStream(fout).println (" ");
 pageCounter = pageCounter + 4;
 for(int FF = 0; FF < totalCampers; FF++){
	   new PrintStream(fout).println(VB[FF]);
	   pageCounter++;
}

new PrintStream(fout).println (" ");
new PrintStream(fout).println (" ");
new PrintStream(fout).println ("Total Campers: " + totalCampers);
pageCounter = pageCounter + 3;   
while(pageCounter >= 54){
pageCounter = pageCounter - 54;
}
Counter = 54 - pageCounter;
for(int count = 0; count < Counter; count++){
new PrintStream(fout).println (" ");
}


String[] SV = new String[100];
System.arraycopy(ASHLEY, 0, SV, 0, ASHLEY.length);
 System.arraycopy(DUSTIN, 0, SV, ASHLEY.length, DUSTIN.length);
 java.util.Arrays.sort(SV);
////////////////NEW      PAGE    //////****************************////////////////////
pageCounter = 0;
totalCampers = (ASHLEYNum + DUSTINNum);
 new PrintStream(fout).println ("_________________________");
 new PrintStream(fout).println ("|   Senior Varsity      |      " + formattedDate);
 new PrintStream(fout).println ("_________________________");
 new PrintStream(fout).println (" ");

 pageCounter = pageCounter + 4;
 for(int FF = 0; FF < totalCampers; FF++){
 	new PrintStream(fout).println (SV[FF]);
 	pageCounter++;
 }
 new PrintStream(fout).println (" ");
 new PrintStream(fout).println (" ");
 new PrintStream(fout).println ("Total SV Campers: " + totalCampers);
 
 pageCounter = pageCounter + 3;
 while(pageCounter >= 54){
		   pageCounter = pageCounter - 54;
	   }
Counter = 54 - pageCounter;
for(int count = 0; count < Counter; count++){
new PrintStream(fout).println (" ");
}		
					   
						////////////////NEW      PAGE    //////****************************////////////////////
										pageCounter = 0;
										 new PrintStream(fout).println ("_________________________");
										 new PrintStream(fout).println ("|       Cath            |      " + formattedDate);
										 new PrintStream(fout).println ("_________________________");
										 new PrintStream(fout).println (" ");
										 new PrintStream(fout).println (" ");
										 new PrintStream(fout).println (" ");
										 new PrintStream(fout).println (" ");
										 pageCounter = pageCounter + 7;
										 for(int FF = 0; FF < CATHNum; FF++){
										 	new PrintStream(fout).println (CATH[FF]);
										 	pageCounter++;
										 }
										 new PrintStream(fout).println (" ");
										 new PrintStream(fout).println (" ");
										 new PrintStream(fout).println ("Total Campers: " + (CATHNum));
										 pageCounter = pageCounter + 3;
										 while(pageCounter >= 54){
												   pageCounter = pageCounter - 54;
											   }
										 Counter = 54 - pageCounter;
											   for(int count = 0; count < Counter; count++){
												   new PrintStream(fout).println (" ");
											   }

												////////////////NEW      PAGE    //////****************************////////////////////
												if(WHONum != 0){
											   pageCounter = 0;
												 new PrintStream(fout).println ("_________________________");
												 new PrintStream(fout).println ("|       ????            |      " + formattedDate);
												 new PrintStream(fout).println ("_________________________");
												 new PrintStream(fout).println (" ");
												 new PrintStream(fout).println (" ");
												 new PrintStream(fout).println (" ");
												 new PrintStream(fout).println (" ");
												 pageCounter = pageCounter + 7;
												 for(int FF = 0; FF < WHONum; FF++){
												 	new PrintStream(fout).println (WHO[FF]);
												 	pageCounter++;
												 }
												 new PrintStream(fout).println (" ");
												 new PrintStream(fout).println (" ");
												 new PrintStream(fout).println ("Total Campers: " + (WHONum));
												 pageCounter = pageCounter + 3;
												 while(pageCounter >= 54){
														   pageCounter = pageCounter - 54;
													   }
												 Counter = 54 - pageCounter;
													   for(int count = 0; count < Counter; count++){
														   new PrintStream(fout).println (" ");
													   }
												}
											    						    		
	   		   
		    // Close our output stream
		    fout.close();		
		}
		// Catches any error conditions
		catch (IOException e)
		{
			System.err.println ("Unable to write to file");
			System.exit(-1);
		}
	}


}
