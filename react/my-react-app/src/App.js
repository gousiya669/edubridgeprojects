import logo from './logo.svg';
import './App.css';
function Welcome(user){
  return <h1>Hello,{user.name}</h1>;
}
function App() {
  return (
    <div>
      <h1>this is my react app</h1>
      <Welcome name='gousiya'/>
    </div>
  );
}

export default App;
