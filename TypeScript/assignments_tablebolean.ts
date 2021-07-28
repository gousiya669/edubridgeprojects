var arr_person;
arr_person = [['Azmina', 420, false], ['Nithila', 2, true], ['arun', 3, true], ['sharmila', 4, true], ['Jay', 5, true], ['akilesh', 6, true]];

for(let i=0; i<6; i++)
{
      {
          
          if(arr_person[i][2]==true)
          {
          arr_person[i][2]='student' ;
          //console.log(arr_person[i][2]);
          }
          else{
              arr_person[i][2]='trainer';
              //console.log(arr_person[i][2]);
          }
          console.log(arr_person[i][0], arr_person[i][1], arr_person[i][2]);
      }
}
