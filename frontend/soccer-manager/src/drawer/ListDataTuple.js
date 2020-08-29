import React from 'react';
import HomeIcon from '@material-ui/icons/Home';
import SwapHorizontalCircleIcon from '@material-ui/icons/SwapHorizontalCircle';

const listDataTuple = [
    {
        name: "Start",
        icon: <HomeIcon/>,
        path: '/'
    }, {
        name: "Transfermarkt",
        icon: <SwapHorizontalCircleIcon/>,
        path: '/transfer'
    },
];

export default listDataTuple; 