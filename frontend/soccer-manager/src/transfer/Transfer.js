import React from 'react';
import Button from '@material-ui/core/Button';
import { makeStyles } from '@material-ui/core/styles';
import LeftSearchContainer from './LeftSearchContainer';
import MidSearchContainer from './MidSearchContainer';
import RightSearchContainer from './RightSearchContainer';

const useStyles = makeStyles(() => ({
    startSearchContainer: {
        gridRow: '3',
        gridColumn: '10',
        marginTop: '20px',
        marginLeft: '20px',
    },
    startSearchButton: {
        width: '100px',
        height: '40px',
    }
}));

const Transfer = _ => {
  const classes = useStyles();

    return (
    <>
        <LeftSearchContainer/>
        <MidSearchContainer/>
        <RightSearchContainer/>
        <div className={classes.startSearchContainer}>
            <Button variant="contained" color="secondary" className={classes.startSearchButton}>
                Search
            </Button>
        </div>
    </>
    )
}

export default Transfer;