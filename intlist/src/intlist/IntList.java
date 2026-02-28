package intlist;
import java.util.stream.IntStream;

/**
 * Definieer en implementeer een IntList-abstractie, waarvan elke instantie een reeks int-waarden opslaat.
 *  Laat de klant toe een lege IntList-instantie aan te maken, de lengte van de reeks op te vragen, het element op een gegeven index, 
 *  en een array met alle elementen. Laat de klant ook toe een element toe te voegen aan het einde van de reeks en te verwijderen van het 
 *  einde van de reeks. Voorzie zo volledig mogelijke documentatie en een volledige testsuite. Test in je testsuite ook dat er geen representation 
 *  exposure is; met andere woorden: test voor elk wijzigbaar object dat de klant doorgeeft aan de abstractie of ontvangt van de abstractie, dat het
 *   wijzigen van dit object geen invloed heeft op de abstractie. (Om helemaal volledige documentatie te schrijven heb je technieken nodig die je 
 *   nog niet kent, maar probeer ze toch al zo volledig mogelijk te krijgen.)

Voorzie twee implementaties: eentje die een array gebruikt om de elementen op te slaan, en eentje die een gelinkte lijst van nodes gebruikt 
(zoals in de JLearner-voorbeelden). De twee implementaties moeten precies dezelfde API aanbieden en dus ook een ongewijzigde test suite doen slagen. 
Je kan de twee implementaties opslaan in aparte Git-commits (of zelfs in aparte Git-branches als je kunt uitvissen hoe dat moet).

 */

/**
 * elke instantie van deze klasse slaat een reeks int-waarden op 
 * @mutable
 * @invar |ListLength() >= 0
 * 
 */
public class IntList {

	
	/**dit is een inspector dus eig had je hier best 'get' voor gezet
	 * de methode creeert telkens een nieuwe int array 
	 * tijdens het uitvoeren van deze methode. de identiteit heeft 
	 * dus geen betekenis want er wordt telkens een nieuwe aangemaakt
	 *@creates |result 
	 *@post | result != null 
	 *@post lengte 'result' moet gelijk zijn aan 'ListLength'
	 *		|result.length == ListLength()
	 *@post dezelfde elementen moeten in beide voorkomen 
	 *		|IntStream.range(0,ListLength()).allMatch(i -> result[i] == IntAtIndex(i))
	 */
	public int [] IntArray()
	{return elements.clone();}
	
	/** dit is een inspector dus eig had je hier best 'get' voor gezet 
	 * post |result == IntArray().length
	 */
	public int ListLength()
	{return elements.length;}
	
	
	
	/**dit is een inspector dus eig had je hier best 'get' voor gezet
	 * @pre index moet groter dan of gelijk aan 0 zijn en kleinder dan de lengte
	 * 		|0 <= index && index < ListLength()
	 *
	 */	
	public int IntAtIndex(int index)
	{return elements[index];}
	
	
	

	
	
	
	/**
	 * de abstractetoestandsinvarianten zijn hier alle geldige abstracte toestanden 
	 * die gelden. deze voldoen aan deze voorwaarde:
	 * 
	 * {(es,l,g)| l = |es| ^  ∀ i < l : g(i) = es_i 
	 * met es de return van IntArray, l de return van Listlength en g 
	 * de verzameling van returns van IntAtIndex(i)
	 * 
	 * 
	 * 
	 * de postcondities bij de inspectoren moeten NIET OVER DE RETURN VALUES VAN SPECIFIEKE INSPECOTR GAAN 
	 * MAAR OVER DE VERZAMELING VAN GELDIGE RETURN VALUES VAN DE INSPECTOREN 
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	/* CONSTRUCTOR */
	/**
	 * @representationObject
	 * @invar | elements != null
	 */
	private int[] elements;
	
	/**
	 * maakt nieuwe lege 'IntList' aan 
	 * post |ListLength() == 0 
	 */
	public IntList()
	{elements = new int[0];}
	
	
	/** MUTATOR
	 * laat de klant toe een nieuw element toe te voegen aan het einde van de reeks 
	 * gebruik hier niet elements.length maar ListLength ( in je contracten moet je abstracte toestanden
	 * gebruiken. de klant kent/ziet elements niet en dit mag dus enkel intern gebruikt worden
	 * @post nieuwe lijst heeft lengte + 1
	 * 		| ListLength() == old(ListLength())+ 1
	 * @post 'x'staat op laatste positie
	 * 		| IntAtIndex(ListLength() - 1) == x
	 * 
	 */
	public void  Add(int x) {
	int [] nieuwelijst = new int [elements.length + 1];
	System.arraycopy(elements,0, nieuwelijst, 0,elements.length);
	nieuwelijst[elements.length] = x;
	elements = nieuwelijst;
	}
	
	
	/** MUTATOR
	 * laat de klant toe element te verwijderen aan het einde van de reeks 
	 * @pre er moet nog een element zijn dat verwijderd kan worden
	 * 		|ListLength() > 0
	 * @post lengte met 1 gedaald
	 * 		|ListLength() == old(ListLength()) - 1
	 * 
	 */
	public void Del() {
		int [] nieuwelijst = new int [elements.length - 1];
		System.arraycopy(elements,0, nieuwelijst, 0,elements.length - 1);
		elements = nieuwelijst;
	}
	
}
