import React from 'react';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import Home from "./pages/Home";

function App() {
  return (
      <Router>
        <Switch>
          <Route path='/' exact={true} component={Home}/>
          {/*<Route path='/persons' exact={true} component={PersonsList}/>*/}
          {/*<Route path='/persons/:id' component={PersonEdit}/>*/}
        </Switch>
      </Router>
  );
}

export default App;
