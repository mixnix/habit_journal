import React from 'react';
import { Container } from 'reactstrap';import MyNavbar from "../components/MyNavbar";

const Home = (props) => {
        return (
            <div>
                <MyNavbar/>
                <Container fluid>
                    Witaj w aplikacji. Aby kontynuować, zaloguj się.
                </Container>
            </div>
        );
};

export default Home;