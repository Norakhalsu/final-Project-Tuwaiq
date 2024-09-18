package com.example.demo.service;

public class servicTest {
//    @ExtendWith(MockitoExtension.class)
//    public class patientServiceTest {
//
//        @InjectMocks
//        TodoService patientService;
//        @Mock
//        TodoRepository patientRepository;
//        @Mock
//        AuthRepository authRepository;
//
//        MyUser user;
//
//        Patient patient1,patient2,patient3;
//
//        List<Patient> patient;
//
//        @BeforeEach
//        void setUp() {
//            user=new MyUser(null,"majd","123","Admin", null);
//            patien1=new Patient(null,"patient1",user);
//            patient2=new patient(null,"patient2",user);
//            patient3=new patient(null,"patient3",null);
//
//            patients=new ArrayList<>();
//            patients.add(patient1);
//            patients.add(patient2);
//            patients.add(patient3);
//        }
//
//
//        @Test
//        public void getAllTodoTest(){
//            when(patientRepository.findAll()).thenReturn(patients);
//            List<Patient> patientList=patientService.getpatient();
//            Assertions.assertEquals(3,patientList.size());
//            verify(patientRepository,times(1)).findAll();
//
//        }
//        @Test
//        public void getPatientByIdTest(){
//            when(authRepository.findMyUserById(user.getId())).thenReturn(user);
//            when(patientRepository.findAllByMyUser(user)).thenReturn(patient);
//
//
//            List<Patient> todo = patientService.getpatient(user.getId());
//            Assertions.assertEquals(todo,todos);
//            verify(authRepository,times(1)).findMyUserById(user.getId());
//            verify(patientRepository,times(1)).findAllByMyUser(user);
//
//        }
//
//        @Test
//        public void AddPatientTest(){
//            when(authRepository.findMyUserById(user.getId())).thenReturn(user);
//            patientService.addPatient(user.getId(),patient3);
//            verify(authRepository,times(1)).findMyUserById(user.getId());
//            verify(patientRepository,times(1)).save(patient3);
//        }
//
//        @Test
//        public void updatePatientTest(){
//
//            when(patientRepository.findTodoById(patient1.getId())).thenReturn(patient1);
//            when(authRepository.findMyUserById(user.getId())).thenReturn(user);
//
//            patientService.updatePatient(patient1.getId(),patien2,user.getId());
//
//            verify(patientRepository,times(1)).findTodoById(patient1.getId());
//            verify(authRepository,times(1)).findMyUserById(user.getId());
//            verify(patientRepository,times(1)).save(patient);
//
//        }



}
