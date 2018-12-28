package demo5;
// Generated by ComTest BEGIN
import java.io.*;
import static org.junit.Assert.*;
import org.junit.*;
import demo5.*;
// Generated by ComTest END

/**
 * Test class made by ComTest
 * @version 2017.02.09 15:24:15 // Generated by ComTest
 *
 */
public class HenkiloTest {



  // Generated by ComTest BEGIN
  /** testToString34 */
  @Test
  public void testToString34() {    // Henkilo: 34
    Henkilo aku = new Henkilo("Aku","Ankka",1934); 
    assertEquals("From: Henkilo line: 36", "Aku|Ankka|1934", aku.toString()); 
    Henkilo pele = new Henkilo("Pele","",1940); 
    assertEquals("From: Henkilo line: 38", "Pele||1940", pele.toString()); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** testGetNimi51 */
  @Test
  public void testGetNimi51() {    // Henkilo: 51
    Henkilo aku = new Henkilo("Aku","Ankka",1934); 
    assertEquals("From: Henkilo line: 53", "Aku Ankka", aku.getNimi()); 
    Henkilo pele = new Henkilo("Pele","",1940); 
    assertEquals("From: Henkilo line: 55", "Pele", pele.getNimi()); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** testGetSyntymavuosi66 */
  @Test
  public void testGetSyntymavuosi66() {    // Henkilo: 66
    Henkilo aku = new Henkilo("Aku","Ankka",1934); 
    assertEquals("From: Henkilo line: 68", 1934, aku.getSyntymavuosi()); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** testTulosta96 */
  @Test
  public void testTulosta96() {    // Henkilo: 96
    ByteArrayOutputStream byteoutput = new ByteArrayOutputStream(); 
    Henkilo hlo = new Henkilo("Aku","Ankka",1934); 
    hlo.tulosta(byteoutput); 
    { String _l_=byteoutput.toString(),_r_="Aku Ankka 1934\\s*"; if ( !_l_.matches(_r_) ) fail("From: Henkilo line: 101" + " does not match: ["+ _l_ + "] != [" + _r_ + "]");}
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** testHenkilo112 */
  @Test
  public void testHenkilo112() {    // Henkilo: 112
    Henkilo asd = new Henkilo(); assertEquals("From: Henkilo line: 113", "||0", asd.toString()); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** testParse126 */
  @Test
  public void testParse126() {    // Henkilo: 126
    Henkilo asd = new Henkilo(); 
    asd.parse("Jonne|Viljami|1994"); assertEquals("From: Henkilo line: 128", "Jonne|Viljami|1994", asd.toString()); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** testHenkilo157 */
  @Test
  public void testHenkilo157() {    // Henkilo: 157
    Henkilo asd = new Henkilo("Mikki|Hiiri"); assertEquals("From: Henkilo line: 158", "Mikki|Hiiri|0", asd.toString()); 
  } // Generated by ComTest END
}