/**
 * This file is part of JavaTest.
 *
 * JavaTest is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JavaTest is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with JavaTest.  If not, see <http://www.gnu.org/licenses/>.
 */
package fr.univtln.bruno.test;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Teste l'execution
     */
    @Test
    public void testApp() {
        String [] args = {""};
        //App.main(args);
    }

    /**
     * Teste l'addition
     */
    @Test
    public void testAdd() {
    //    assertEquals(6,App.add(4,2));
    }

    /**
     * Teste l'erreur émise lors de l'instancition de l'App
     * (Impossible avec private sur le constructeur)
     */
    /*@Test(expected=IllegalAccessError.class)
    public void testIllegalAccessError() {
        App app = new App();
    }*/

}
