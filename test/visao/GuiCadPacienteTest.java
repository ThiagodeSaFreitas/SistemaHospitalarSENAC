/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package visao;

import dao.PacienteDAO;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import modelo.Paciente;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Thiago de Sá
 */
public class GuiCadPacienteTest {
    
    private PacienteDAO pacienteDAO;
    
    public GuiCadPacienteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        pacienteDAO = new PacienteDAO();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testCadastrar() throws ParseException, SQLException  {
         SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
         Date dataExemplo = sdf.parse("05/12/1987");
         
        Paciente pac = new Paciente(5,"TESTEJUnit","Rua l",dataExemplo, "(88)8888-8888", "555444411111", "999999999", "teste@.com", 1);
        pacienteDAO.cadastrarPaciente(pac);
        assertEquals(pac.getNome(),"TESTEJUnit");
    }
    
}
