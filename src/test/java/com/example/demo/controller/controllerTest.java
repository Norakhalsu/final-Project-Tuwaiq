package com.example.demo.controller;

public class controllerTest {
//    @MockBean
//    PatientService patientService;
//
//    @Autowired
//    MockMvc mockMvc;
//
//    Patient patient1,patient2,patient3;
//    MyUser myUser;
//
//    ApiResponse apiResponse;
//
//    List<Paient> paient,PaientList;
//
//    @BeforeEach
//    void setUp() {
//        myUser=new MyUser(1,"Maha" , "12345" , "ADMIN" , null);
//        patient1 = new Patient(1, "todo1", myUser );
//        patient2 = new Patient(2 , "todo2",  myUser );
//        patient3 = new Patient(3 , "todo3", myUser );
//        patients= Arrays.asList(patient1);
//        patientList=Arrays.asList(patient2);
//
//
//
//    }
//
//    @Test
//    public void GetAllTodo() throws Exception {
//        Mockito.when(patientService.getPatient()).thenReturn(paient);
//        mockMvc.perform(get("/api/v1/todo/get-all"))
//                .andExpect(status().isOk())
//                .andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.hasSize(1)))
//                .andExpect(MockMvcResultMatchers.jsonPath("$[0].title").value("patient1"));
//    }
//
//    @Test
//    public void testAddTodo() throws  Exception {
//        mockMvc.perform(post("/api/v1/todo")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content( new ObjectMapper().writeValueAsString(patient1)))
//                .andExpect(status().isOk());
//
//    }
//
//    @Test
//    public void testDeleteTodo() throws Exception{
//        mockMvc.perform(delete("/api/v1/patient/{patientId}",patient1.getId()))
//                .andExpect(status().isOk());
//
//    }



}
