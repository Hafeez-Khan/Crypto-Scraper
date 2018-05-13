package openingBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

//Hafeez
//may 13th


public class CryptoScraper {

	public static void main(String[] args) throws InterruptedException {
		
		String [] names = {"Binance", "Bittrex", "Kucoin", "Poloniex", "Bitfinex"};
		String [] coins = {
				"Circuits of Value",
				"Payfair",
				"Quantum",
				"Atmos",
				"Stealthcoin",
				"Primas",
				"Solaris",
				"ArtByte",
				"Magnet",
				"Zoin",
				"Internet of People",
				"FirstCoin",
				"Aventus",
				"BitSend",
				"OracleChain",
				"OBITS",
				"Autonio",
				"Social Send",
				"DAO.Casino",
				"Vcash",
				"Ecobit",
				"ATLANT",
				"FlypMe",
				"Mysterium",
				"Innova",
				"Upfiring",
				"PinkCoin",
				"Espers",
				"MyWish",
				"Primecoin",
				"HelloGold",
				"Sphere",
				"Exchange Union",
				"UFO Coin",
				"Universal Currency",
				"AudioCoin",
				"Etheroll",
				"Bitdeal",
				"Curecoin",
				"EarthCoin",
				"Bitmark",
				"TrezarCoin",
				"Lampix",
				"ProChain",
				"REX",
				"Bonpay",
				"CrowdCoin",
				"Pluton",
				"Tao",
				"HEROcoin",
				"Creditbit",
				"Crave",
				"Pure",
				"Bela",
				"B2B",
				"Opus",
				"Bitcloud",
				"Qwark",
				"The ChampCoin",
				"NuBits",
				"DopeCoin",
				"Astro",
				"Hacken",
				"Sprouts",
				"Bitzeny",
				"TransferCoin",
				"VIVO",
				"Pesetacoin",
				"Auroracoin",
				"AdShares",
				"Altcoin",
				"SpreadCoin",
				"Blockpool",
				"PRIZM",
				"Vsync",
				"Breakout",
				"Novacoin",
				"IntenseCoin",
				"Syndicate",
				"VeriumReserve",
				"Memetic / Pepecoin",
				"HyperStake",
				"Dotcoin",
				"CannabisCoin",
				"GoldCoin",
				"TrueFlip",
				"Zero",
				"Blitzcash",
				"Bitcoin Plus",
				"Riecoin",
				"DigiPulse",
				"Farad",
				"Wild Crypto",
				"Synergy",
				"DNotes",
				"Indorse Token",
				"Privatix",
				"Masternodecoin",
				"Kore",
				"E-Dinar Coin",
				"Hubii Network",
				"ChainCoin",
				"1337",
				"KiloCoin",
				"Internxt",
				"Breakout Stake",
				"Ethereum Movie Venture",
				"HollyWoodCoin",
				"vTorrent",
				"Dai",
				"Creativecoin",
				"2GIVE",
				"DCORP",
				"Project Decorum",
				"Royal Kingdom Coin",
				"Rupee",
				"Social",
				"Starta",
				"ToaCoin",
				"Sharechain",
				"BitcoinZ",
				"Carboncoin",
				"Sexcoin",
				"eBitcoin",
				"Commodity Ad Network",
				"XGOX",
				"BuzzCoin",
				"REAL",
				"Ixcoin",
				"Embers",
				"TrustPlus",
				"Eroscoin",
				"EquiTrader",
				"ProCurrency",
				"Adelphoi",
				"ExclusiveCoin",
				"Tokes",
				"Startcoin",
				"WandX",
				"EncryptoTel [Waves]",
				"BitBoost",
				"EuropeCoin",
				"Ellaism",
				"NobleCoin",
				"Terracoin",
				"PutinCoin",
				"vSlice",
				"Zeitcoin",
				"Bowhead",
				"CryptoPing",
				"SmartBillions",
				"Footy Cash",
				"Zephyr",
				"EverGreenCoin",
				"Dynamic",
				"Karbo",
				"ZrCoin",
				"APX",
				"Magi",
				"Quark",
				"Ergo",
				"eBoost",
				"FORCE",
				"ELTCOIN",
				"Qvolta",
				"Condensate",
				"MarteXcoin",
				"Crypto Bullion",
				"HunterCoin",
				"LuckChain",
				"Ethbits",
				"CHIPS",
				"Anoncoin",
				"TheGCCcoin",
				"e-Gulden",
				"Linx",
				"bitJob",
				"Halcyon",
				"ParkByte",
				"Denarius",
				"Bitcoin Scrypt",
				"MCAP",
				"Interstellar Holdings",
				"Unify",
				"Ethereum Cash",
				"WorldCoin",
				"FLiK",
				"DigitalPrice",
				"FlutterCoin",
				"Yocoin",
				"BlueCoin",
				"Moin",
				"Monkey Project",
				"ERC20",
				"STRAKS",
				"Renos",
				"NEVERDIE",
				"ArcticCoin",
				"Bata",
				"Goodomy",
				"Gimli",
				"Centurion",
				"Primalbase Token",
				"CampusCoin",
				"Megacoin",
				"CarTaxi Token",
				"Etheriya",
				"IncaKoin",
				"InsaneCoin",
				"Greencoin",
				"Adzcoin",
				"Bitradio",
				"DraftCoin",
				"Scorecoin",
				"Dinastycoin",
				"Cream",
				"Version",
				"PopularCoin",
				"Electra",
				"Elementrem",
				"Copico",
				"Hawala.Today",
				"Darcrus",
				"FundYourselfNow",
				"Emphy",
				"Ethereum Gold",
				"42-coin",
				"NetCoin",
				"LiteDoge",
				"FujiCoin",
				"Canada eCoin",
				"PureVidz",
				"Cryptonite",
				"CryptoForecast",
				"Kolion",
				"MazaCoin",
				"Jetcoin",
				"Desire",
				"Accelerator Network",
				"InflationCoin",
				"Legends Room",
				"Oceanlab",
				"AurumCoin",
				"Steneum Coin",
				"UnbreakableCoin",
				"Abjcoin",
				"Influxcoin",
				"Machinecoin",
				"Orbitcoin",
				"TeslaCoin",
				"Bytecent",
				"Kurrent",
				"KekCoin",
				"Hafeez"
				};
		
		//initializing the chrome driver
		System.setProperty("webdriver.chrome.driver", "/Users/hafeezkhan/Desktop/workplace/Crypto Scraper/lib/chromedriver/chromedriver");
		
		//Creating a WebDriver object
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://coinmarketcap.com");
		
		//Running a for loop for each coin
		for (int i = 0; i < coins.length; i++) {
		//Finding the search button on the website and sending a coin
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse-1\"]/form/div/span/input")).sendKeys(coins[i]);
	
		//Created a search object which was clicked
		WebElement search = driver.findElement(By.xpath("//*[@id=\"navbar-collapse-1\"]/form/button/i"));
		search.click();
		
		//Created a market object which was clicked
		WebElement market = driver.findElement (By.xpath("/html/body/div[4]/div/div[1]/div[5]/div[1]/ul/li[2]"));
		market.click();
		
		//Scrolling down on the website to the market exchange
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,750)", "");
		
		System.out.print (coins[i] + " : " );
		
		//Running a for loop through names
		for (int j = 0; j<names.length; j++) {
			//if the page contains the name it is printed
			
			if(driver.getPageSource().contains(names[j])) {
				System.out.print(names[j] + " ");
			}
		}
		System.out.println("");
		
		//Scrolling up on the website
		jse.executeScript("window.scrollBy(0,-750)", "");
		
		}
		
		//close the website
		driver.quit();
		
	}

}
