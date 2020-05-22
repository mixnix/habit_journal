import React from "react";
import { Formik, Form } from "formik";
import * as Yup from "yup";
import MyTextInput from "../components/MyTextInput";

const Home = (props) => {

    const handleSubmit = async (values) => {
        await fetch('/api/activities', {
            method: 'POST',
            body: JSON.stringify(values),
            headers: {'Content-Type': 'application/json'}
        }).then((response) => {
            if(response.status === 200){
                alert("udalo sie");
            }else{
                alert("nie udalo sie");
            }
        });
    };

    return (
        <div className="container">
            <div className="row">
                <div className="col-md-8 m-auto">
                    <Formik
                        initialValues={{
                            activityCategory: "",
                            description: "",
                            startTime: null,
                            endTime: null
                        }}
                        validationSchema={Yup.object({
                        })}
                        onSubmit={(values, { setSubmitting }) => {
                            handleSubmit(values);
                            setSubmitting(false);
                        }}
                    >
                        <Form>
                            <MyTextInput name="activityCategory" type="text" placeholder="Category"/>
                            <MyTextInput name="description" type="text" placeholder="Description"/>
                            <MyTextInput name="startTime" type="date" label="Start Time"/>
                            <MyTextInput name="endTime" type="date" label="End Time"/>

                            <button type="submit">Submit</button>
                        </Form>
                    </Formik>
                </div>
            </div>
        </div>
    );
};

export default Home;