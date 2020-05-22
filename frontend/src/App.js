import React from 'react';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import Home from "./pages/Home";
import ActivitiesByDay from "./pages/ActivitiesByDay";

function App() {
  return (
      <Router>
        <Switch>
          <Route path='/' exact={true} component={Home}/>
          <Route path='/activities-by-day' component={ActivitiesByDay}/>
        </Switch>
      </Router>
  );
}

export default App;
